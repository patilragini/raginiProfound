
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
		static int month,date,year,x,y,m,d;
		public static void main(String args[]){
			date=Integer.parseInt(args[0]);
			month=Integer.parseInt(args[1]);
			year=Integer.parseInt(args[2]);
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