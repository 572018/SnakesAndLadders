package entity;


/**
 * 
 * @author janwi
 *
 * The squares a piece can stand on. Each square might have a ladder or snake that takes
 * you forward or backwards.
 * 
 * The jumps are collected in a list instead of to each square, so each square could have just been a number. 
 * The whole board is kinda unnecessary with a text based interface. 
 */
public class Square {
	
	int jump;
	
	public Square(int jump) {
		this.jump = jump;
	}

	public int getJump() {
		return jump;
	}

	public void setJump(int jump) {
		this.jump = jump;
	}
}
