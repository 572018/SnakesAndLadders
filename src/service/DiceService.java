package service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import entity.Dice;
import textInterface.TextPrinter;

/**
 * 
 * @author janwi
 * 
 * Dice service rolls a number of dices and sums them up
 */
public class DiceService {

	
	public int rollDice() {
		List<Dice> list = new ArrayList<Dice>();
		
		//change 1 to number of dice if required
		for(int i = 0; i < 1; i++) {
			Dice dice = new Dice();
			dice = roll();
			list.add(dice);
		}
			return list.stream().map(dice -> dice.getValue()).reduce(0, Integer::sum);
	}	
	
	private Dice roll() {
		Dice dice = new Dice();
		dice.setValue(ThreadLocalRandom.current().nextInt(1, 6 + 1));
		return dice;
	}
	
	
}
