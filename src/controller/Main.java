package controller;

import java.util.EventListener;

import entity.*;
import service.SnakesAndLadderService;
import textInterface.TextPrinter;

/**
 * 
 * @author janwi
 *
 * Main class that runs everything
 */
public class Main {
	
	static SnakesAndLadderService salService;
	
	static TextPrinter print;
	
	public static void main(String[] args) {
		
		salService = new SnakesAndLadderService();
		
		print = new TextPrinter();
		
		print.Welcome();
		
		SnakesAndLadders game = salService.setup();
		EventListener event;
		
		salService.play();
		
	}
}
