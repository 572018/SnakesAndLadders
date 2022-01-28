package entity;

import java.util.ArrayList;
import java.util.List;


/**
 * @author janwi
 * 
 * @param board - Board as a list of 100 squares
 *
 * The board isnt really in use, since each square is a number we can just set the squarenumber to each piece and not use the board.
 * The snakes and ladders are contained in a list of its own
 */
public class Board {

	List<Square> board;
	
	public Board() {
		this.board = new ArrayList<Square>(100);
	}

	public List<Square> getSquares() {
		return board;
	}

	/**
	 * @param squares - takes inn a list of squares (the squares of the board)
	 */
	public void setSquares(List<Square> squares) {
		this.board = squares;
	}
	
}
