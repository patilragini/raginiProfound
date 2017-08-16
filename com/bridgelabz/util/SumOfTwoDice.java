/****************************************************************************** 
 *  Purpose: Generate Sum of 2 Dice
 *
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;

	static int die1,die2,rollSum; 
	public class SumOfTwoDice {
    	public static void main(String args[]){        
			die1 = (int)(Math.random()*6) + 1;
			die2 = (int)(Math.random()*6) + 1;
			System.out.println("Die 1 = "+die1);
			System.out.println("Die 2 = "+die2);
			rollSum = die1+die2;  
			System.out.println("Sum of 2 dice = "+rollSum);
    	}
}
