
/******************************************************************************
 *  Compilation:  javac -d bin CarLoan.java
 *  Execution:    java -cp bin com.bridgelabz.util.CarLoan n n n 
 *  
 *  Purpose: Determines monthlly payment take principle,year and rate entered by user 
			 and gives payment to be made monthlly
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class CarLoan{
	static double principle,rate,year, n,r,payment;
	public static void main(String args[]){
		principle=Double.parseDouble(args[0]);
		year=Double.parseDouble(args[1]); 
		rate=Double.parseDouble(args[2]);
		r=(rate/(12*100));		//calculate r
		n=12*year;				//calculatre n
		payment=(principle*r)/(1-Math.pow(1+r,(-n)));		//payment formula
		System.out.println("monthly payment="+payment+"rs");		//print payment to be paied
	}
}