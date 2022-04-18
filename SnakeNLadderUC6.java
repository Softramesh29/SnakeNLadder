package com.bridgelabz.SnakeandLadder;

import java.util.Random;

public class SnakeNLadderUC6 {
	static final int NO_PLAY = 2;
	static final int IS_SNAKE = 1;
	static final int IS_LADDER = 0;
	
	public static void main(String[] args) {
		
		int start = 0;
		int point = 0;
		int currentPosition = 0;
		int counter = 0;

		for (currentPosition = 0; currentPosition <= 100; currentPosition++) {
			
		Random r = new Random();
		int dice = 1 + r.nextInt(6);
		
		Random m = new Random();
		int chooseOption = m.nextInt(3);
	
		if (chooseOption == IS_SNAKE ) {
			if (dice > 6 || currentPosition > 6)
			point = (start-dice);
		}	
		else if (chooseOption == IS_LADDER) { 
			 if((point+dice) <= 100)
			point = (start+dice);
				}	
		else
		 	point = start;
			counter += 1;
			currentPosition += point;
			System.out.println(counter +" Turn "+" Player move to " +currentPosition);
		}
		System.out.println("Number of time dice played : " +counter);
			
	}
}
