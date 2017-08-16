/******************************************************************************
 *  Compilation:  javac -d bin WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.util.WindChill n n 
 
 *  Purpose: Determines effective temperature to be ;find wind chill
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
 
package com.bridgelabz.util;
public class WindChill{
	public static void main(String args[]){
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		double a,b,c,wc=0;		// double variables to store calculations
		if(t<=50&& (v<=120 && v>=3)){
			a=(35.74+0.6215);		//stores addition of double values
			b=((0.4275*t)-35.75);
			/* Math.pow is mathematical function in lang package for taking power of given number*/
			c=Math.pow(v,0.16);		//(v,0.16) 0. is raise to power of v and stored in v variable
			wc=(a+(b*c));		
	}
		System.out.println("  v="+v+"\n  t="+t+"\n   Wind Chill="+wc);
	}
}