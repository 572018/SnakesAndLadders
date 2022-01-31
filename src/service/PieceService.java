package service;

import java.util.ArrayList;
import java.util.List;

import entity.Piece;
import entity.Scan;

/**
 * 
 * @author janwi
 * 
 * Piece Service will create the players and set them to their start position
 *
 */
public class PieceService {
	
	List<Piece> players;
	
	public void movePiece(int squares, Piece player) {
		
		player.setBoardPosition(player.getBoardPosition() + squares);
	}
	
	/**
	 * Takes String input as name of a player.
	 * 
	 * @return list<Piece> name of players
	 */
	public List<Piece> namePlayers() {
		
		players = new ArrayList<Piece>();
		
		for(int i = 0; i < 4; i++) {
			Piece p = new Piece(Scan.sc.nextLine());
			players.add(p);
			if(players.get(i).getPlayerName().toLowerCase().equals("avslutt")) {
				System.out.println("Avslutter programmet");
				System.exit(0);
			} else if(players.get(i).getPlayerName().toLowerCase().equals("spill")) {
				i = 4;
				players.remove(players.size() -1 );
				System.out.println("Starter spill");
			}
		}
		return players;
		
	}
	
	public List<Piece> getPlayers() {
		return players;
	}
}
