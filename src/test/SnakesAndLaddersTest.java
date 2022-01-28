 package test;


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

//	@Before
//	public void setUp() throws Exception {
//		salService = new SnakesAndLadderService();
//		
//		print = new TextPrinter();
//		
//		print.Welcome();
//		
//		SnakesAndLadders game = salService.setup();
//		EventListener event;
//		
//		salService.play();
//	}
	
	@Test
	public void playerStartsInSquare1() throws Exception{
//		salService = new SnakesAndLadderService();
//		print = new TextPrinter();
//		
//		print.Welcome();
//		
//		SnakesAndLadders game = salService.setup();
//		EventListener event;
		
		Piece p = new Piece("Jonas");
		
//		List<Piece> players = game.getPlayers();
//		assertArrayEquals(players.forEach(e -> e.getBoardPosition()),1);
		
		assertEquals(p.getBoardPosition(),1);

		
	}
	
	// player Should Be In Square 14 After Landing On Ladder on square 4
	@Test
	public void ladderTest() throws Exception {
//		Dice dice = new Dice();
//		dice.setValue(3);
		
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
	
	//Player should stand still if position + dice roll is greater than 100(last position)
	@Test
	public void standStillTest() throws Exception {
		PieceService pieceService = new PieceService();
		Piece p = new Piece("Jonas");
		p.setBoardPosition(98);
		
		SnakesAndLadderService SLS = new SnakesAndLadderService();
		SLS.playRound(p);
		
//		pieceService.movePiece(3, p);
		
		
		assertEquals(p.getBoardPosition(), 98);
		
	}
	
	
	
//	@Test
//	public void ArrayPlayersStartsInSquare1() throws Exception{
//		salService = new SnakesAndLadderService();
//		print = new TextPrinter();
//		
//		print.Welcome();
//		
//		SnakesAndLadders game = salService.setup();
//		EventListener event;
//		
//		
//		List<Piece> players = game.getPlayers();
//		assertArrayEquals(players.forEach(e -> e.getBoardPosition()),1);
//		
//
//		
//	}

}
