

/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin
 *  
 *  Purpose: simulate a fair coin flip and print  "head " or "tail" accordingly
 *  @author  ragini patil
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
 
public class FlipCoin{
	/*
    * The main function is written to test FlipCoin class
    */
	public static void main(String[] args){
		//math.random() returns value between 0.0 and 1.08-08-2017	}
		//so it is heads or tail 50% of time
		if(Math.random()<0.5){
		System.out.println("Heads");//print head
		}
		else{
			System.out.println("Tails");//print tail
		}
	}//main end
}