
/******************************************************************************
 *  Compilation:  javac -d bin Payment.java
 *  Execution:    java -cp bin com.bridgelabz.util.Payment n n n
 *  
 *  Purpose: Determines monthlly payment take principle,year and rate entered by user 
			 and gives payment to be made monthlly
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class Payment{
	/*
    * The main function is written to test class
    */
	public static void main(String args[]){
		/*  principle,year and rate is given by user is accepted as args[0],args[1],args[2] as string ,they are converted to 
		double Double.parseDouble(args[]);*/
		double principle=Double.parseDouble(args[0]);
		double year=Double.parseDouble(args[1]); 
		double rate=Double.parseDouble(args[2]);
		double n,r,payment;//n,r,payment are variables to store calculations
		r=(rate/(12*100));		//calculate r
		n=12*year;				//calculatre n
		payment=(principle*r)/(1-Math.pow(1+r,(-n)));		//payment formula
		System.out.println("monthly payment="+payment+"rs");		//print payment to be paied
	}
}