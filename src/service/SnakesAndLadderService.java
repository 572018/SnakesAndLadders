package service;

import java.util.List;
import java.util.Map;

import entity.Piece;
import entity.SnakesAndLadders;
import tables.Shortcuts;
import textInterface.TextPrinter;

/**
 * 
 * @author janwi
 *
 * SnakesAndLadderService does all the main operations of running the game and each round
 */
public class SnakesAndLadderService {

	SnakesAndLadders SaL;
	PieceService pieceService;
	DiceService diceService;
	Shortcuts shortcut;
	TextPrinter print;

	boolean going;

	public SnakesAndLadderService() {
		pieceService = new PieceService();
		diceService = new DiceService();
		shortcut = new Shortcuts();
		print = new TextPrinter();
	}

	/**
	 * Setup for a game of Snakes and Ladder
	 * @return SnakesAndLadders
	 */
	public SnakesAndLadders setup() {
		SnakesAndLadders SaL = new SnakesAndLadders();

		List<Piece> players = pieceService.namePlayers();

		SaL.setPlayers(players);

		return SaL;
	}

	/**
	 * Plays a game of Snakes and Ladders by going through a list of players 
	 */
	public void play() {

		going = true;

		List<Piece> players = pieceService.getPlayers();
		while (going) {
			players.stream().forEach(player -> {
				System.out.println(player.getPlayerName() + "'s turn:");
				going = playRound(player);
			});
		}

	}

	/**
	 * 
	 * @param player - the player plays their round
	 * @return boolean - if the game continues or stops. It stops when a winner is announced
	 */
	public boolean playRound(Piece player) {
		int sum = diceService.rollDice();
		
		canMove(sum, player);
		checkIfShortcut(player);
		if (player.getBoardPosition() == 100) {
			print.announceWinner(player);
			System.exit(0);
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Checks if a player is on a snake or ladder
	 * @param player - the player's turn
	 */
	public void checkIfShortcut(Piece player) {
		Map<Integer, Integer> cuts = shortcut.getShortcuts();
		if (cuts.get(player.getBoardPosition()) != null) {
			int newPosition = cuts.get(player.getBoardPosition());
			if (player.getBoardPosition() < newPosition) {
				print.shortcut(newPosition, player);
			} else {
				print.badShortcut(newPosition, player);
			}
			player.setBoardPosition(newPosition);
		}
	}

	/**
	 * checks if a player is able to move. 
	 * A player cannot move past square 100
	 * 
	 * @param sum - the value on the dice
	 * @param player - the player object
	 */
	public void canMove(int sum, Piece player) {
		if (player.getBoardPosition() + sum <= 100) {
			print.movePiece(sum, player);
			pieceService.movePiece(sum, player);
		} else {
			print.cannotMoveThere(sum, player);
		}
	}

}
