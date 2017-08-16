

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
	static int x,y;
	static double dist,p;
	public static void main(String args[]){
		x =Integer.parseInt(args[0]);
		y =Integer.parseInt(args[1]);
		/* Math.sqrt is mathematical function in lang package for taking square root*/
		dist =Math.sqrt(x*x+y*y);  //distance formula.
		System.out.println("Distance from ("+x+"," +y+") to (0,0)="+dist);
		/* Math.pow is mathematical function in lang package for taking power of given number*/
		double p =Math.pow(x,3); 		//(x,3) 3 is raise to power of x and stored in p variable
		System.out.println("Power of x="+p);
	}
}



