package com.bridgelabz.SnakeandLadder;

import java.util.Random;

public class SnakeNLadderUC5 {
	static final int NO_PLAY = 2;
	static final int IS_SNAKE = 1;
	static final int IS_LADDER = 0;
	
	public static void main(String[] args) {
		
		int start = 0;
		int point = 0;
		int currentPosition = 0;

		for (currentPosition = 0; currentPosition <= 100; currentPosition++) {
			
		Random r = new Random();
		int dice = 1 + r.nextInt(6);
		
		Random m = new Random();
		int chooseOption = m.nextInt(3);
	
		if (chooseOption == IS_SNAKE ) {
			if (point > 6 || currentPosition > 6)
			point = (start-dice);
		}	
		else if (chooseOption == IS_LADDER) { 
			 if((point+dice) <= 100)
			point = (start+dice);
				}	
		else
		 	point = start;
			currentPosition += point;
			System.out.println("Player move to " +currentPosition);
		}
			
	}	
}
