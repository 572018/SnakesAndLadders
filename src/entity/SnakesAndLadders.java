package entity;

import java.util.List;

/**
 * 
 * @author janwi
 *
 * All the components are connected in this class
 * 
 * @param board - The board that contains the squares
 * @param players - list of all the players
 */
public class SnakesAndLadders {
	
	Board board;
	List<Piece> players;
	
	public SnakesAndLadders(Board board, List<Piece> players) {
		this.board = board;
		this.players = players;
	}
	
	public SnakesAndLadders() {
		this.board = new Board();
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public List<Piece> getPlayers() {
		return players;
	}

	public void setPlayers(List<Piece> players) {
		this.players = players;
	}
	
	
}
