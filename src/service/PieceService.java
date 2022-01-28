package service;

import java.util.ArrayList;
import java.util.List;

import entity.Piece;
import entity.Scan;

public class PieceService {
	
	List<Piece> players;
	
	public void movePiece(int squares, Piece player) {
		
		player.setBoardPosition(player.getBoardPosition() + squares);
	}
	
	public List<Piece> namePlayers() {
		
		players = new ArrayList<Piece>();
		
		for(int i = 0; i < 4; i++) {
			Piece p = new Piece(Scan.sc.nextLine());
			p.setID(i+1);
			players.add(p);
			if(players.get(i).getPlayerName().equals("avslutt")) {
				System.out.println("Avslutter programmet");
				System.exit(0);
			} else if(players.get(i).getPlayerName().equals("spill")) {
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
