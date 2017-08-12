/******************************************************************************
 *  Compilation:  javac -d bin PrintThreeNames.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrintThreeNames
 *  
 *  Purpose:  takes three names entered by user and print in reverse
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;


class PrintThreeNames{
	public static void main (String args[]){
		String a,b,c;
		a=args[0];
		b=args[1];
		c=args[2];
		System.out.println("  Hi  "+c+" "+b+" "+a);
	}
}
		
