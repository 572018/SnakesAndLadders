 package test;


 /**
  * @author Jonas
  * 
  */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import entity.Dice;
import entity.Piece;
import service.PieceService;
import service.SnakesAndLadderService;
import textInterface.TextPrinter;

public class SnakesAndLaddersTest {
	static SnakesAndLadderService salService;
	
	static TextPrinter print;

	//Player should be in square 1 when created
	@Test
	public void playerStartsInSquare1() throws Exception{
		
		Piece p = new Piece("Jonas");
	
		assertEquals(p.getBoardPosition(),1);

		
	}
	
	// player Should Be In Square 14 After Landing On Ladder on square 4
	@Test
	public void ladderTest() throws Exception {
		
		PieceService pieceService = new PieceService();
		Piece p = new Piece("Jonas");
		
		pieceService.movePiece(3, p);
		SnakesAndLadderService SLS = new SnakesAndLadderService();
		SLS.checkIfShortcut(p);
		
		assertEquals(p.getBoardPosition(),14);
		
		
		
	}
	
	// player Should Be In Square 6 After Landing On snake on square 16
	@Test
	public void snakeTest() throws Exception {
		PieceService pieceService = new PieceService();
		Piece p = new Piece("Jonas");
		
		pieceService.movePiece(15, p);
		SnakesAndLadderService SLS = new SnakesAndLadderService();
		SLS.checkIfShortcut(p);
		
		assertEquals(p.getBoardPosition(),6);
	}
	
	//Player should stand still if position + dice roll is greater than 100
	@Test
	public void standStillTest() throws Exception {
		PieceService pieceService = new PieceService();
		Piece p = new Piece("Jonas");
		p.setBoardPosition(98);
		
		SnakesAndLadderService SLS = new SnakesAndLadderService();
		SLS.canMove(3,p);
		
		
		
		assertEquals(p.getBoardPosition(), 98);
		
	}
	

}
