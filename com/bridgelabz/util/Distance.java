//6******					( A) prog to calculate 1) distance 2) power

/******************************************************************************
 *  Compilation:  javac -d bin Distance.java
 *  Execution:    java -cp bin com.bridgelabz.util.Distance n n
 *  
 *  Purpose: Determines the Distance and Power of entered numbers 
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
public class Distance{
	/*
    * The main function is written to test Distance class
    */
	public static void main(String args[]){
		/* number is given by user is accepted as args[0] as string ,args[0] is converted to integer using 
			Integer.parseInt(args[0]) and stored in variable x */
		int x =Integer.parseInt(args[0]);
		/* number is given by user is accepted as args[1] as string ,args[1] is converted to integer using 
			Integer.parseInt(args[0]) and stored in variable y */
		int y =Integer.parseInt(args[1]);
		/* Math.sqrt is mathematical function in lang package for taking square root*/
		//dist variable stores result of Math.sqrt function
		double dist =Math.sqrt(x*x+y*y);  //distance formula.
		System.out.println("Distance from ("+x+"," +y+") to (0,0)="+dist);
		/* Math.pow is mathematical function in lang package for taking power of given number*/
		double p =Math.pow(x,3); 		//(x,3) 3 is raise to power of x and stored in p variable
		System.out.println("Power of x="+p);
	}
}



