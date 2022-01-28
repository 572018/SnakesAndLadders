package entity;

/**
 * 
 * @author janwi
 * 
 * A piece with a player name and its own board position.
 * 
 * @param playerName - The name of the player
 * @param boardPosition - The position of the piece on the board
 * 
 */
public class Piece {

	String playerName;
	int boardPosition;
	
	public Piece(String playerName) {
		this.playerName = playerName;
		this.boardPosition = 1;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getBoardPosition() {
		return boardPosition;
	}

	public void setBoardPosition(int boardPosition) {
		this.boardPosition = boardPosition;
	}

}
