package com.bridgelabz.SnakeandLadder;

import java.util.Random;

public class SnakeNLadderUC3 {
	
	static final int NO_PLAY = 2;
	static final int IS_SNAKE = 1;
	static final int IS_LADDER = 0;
	
	public static void main(String[] args) {
		
		int playerPosition = 20;
		int isLadder;
		int isSnake;
		int noPlay;
		
		Random r = new Random();
		int dice = 1 + r.nextInt(6);
		System.out.println("Dice point : " +dice);
		
		Random m = new Random();
		int chooseOption = m.nextInt(3);
			
		if (chooseOption == IS_LADDER) {
			isLadder = (playerPosition+dice);	
			System.out.println("Player move from " + playerPosition + " to " +isLadder);
		}
		else if (chooseOption == IS_SNAKE) {
			isSnake = (playerPosition-dice);
			System.out.println("Player move from " + playerPosition + " to " +isSnake);
		}	 
		else
			System.out.println("Player in the same position");	
	}	
		
		
		
}

