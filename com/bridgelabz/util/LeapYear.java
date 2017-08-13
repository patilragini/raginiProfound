
/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.util.LeapYear n
 *  
 *  Purpose: Determines whether entered number  n is leap year
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

/* leap year program */

public class LeapYear{
	public static void main(String args[]){
		/* number is given by user is accepted as args[0] as string ,args[0] is converted to integer using 
		Integer.parseInt(args[0]) and stored in variable year*/
		int year=Integer.parseInt(args[0]);
		/* isLeapYear is a boolean variable  which is used to store true or false 
		true means year is leap year else not leap year*/
		boolean isLeapYear;
		//see if year is divisible by 4 and remainder==0
		isLeapYear=(year%4==0); 
		//cheak if it is centuary  and divisible by 4 then true else false
		isLeapYear=isLeapYear && (year%100 != 0);
		//divisible by 4&100 unless/or divisible by 400
		isLeapYear=isLeapYear || (year%400 == 0);
		//print the value
		System.out.println(isLeapYear);
	}
}
