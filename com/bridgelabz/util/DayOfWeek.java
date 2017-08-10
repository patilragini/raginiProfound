//10******
/******************************************************************************
 *  Compilation:  javac -d bin DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.util.DayOfWeek n n n 
 
 *  Purpose: Determines day of enterd date month year by user
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class DayOfWeek{
	/*
    * The main function is written to test DayOfWeek class
    */
	public static void main(String args[]){
		/* date month year are given by user  accepted as args[0] args[1]args[2]as string ,args[] is converted to integer using 
		Integer.parseInt(args[]) and stored in variable date month year resoectively */
		int date=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		int x,y,m,d; // integer variable to store calculation
		
		y=(year-((14-month)/12));
		x=(y+(y/4)-(y/100)+(y/400));
		m=(month+12*((14-month)/12)-2);
		d=((date+x+(31*m)/12)%7);
		// print day
		System.out.println("day is ="+d);
		// d is used as choice in switch
		switch(d){
			case 0:
			//case 0 true print sunday
			System.out.println("Sunday");
			break; 		//break and go out of switch
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
		}
	}
}