
/******************************************************************************
 *  Compilation:  javac -d bin SpringSeason.java
 *  Execution:    java -cp bin com.bridgelabz.util.SpringSeason n n
 *  
 *  Purpose: Determines whether month and date is spring or not
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class SpringSeason{
	int m,d;
	public static void main(String args[]){
		// month and day is given by user
		m=Integer.parseInt(args[0]);
		d=Integer.parseInt(args[1]);
		/*ispring is boolean variable to determine true or false ;true indicates spring , false as not spring*/
		boolean isspring=(m==3&&d>=20&&d<=31)||
		(m==4&&d>=1&&d<=30)||
		(m==3&&d>=1&&d<=31)||
		(m==5&&d>=1&&d<=30)||
		(m==6&&d>=1&&d<=20);
		//print true or false using System.out.println() function.
		System.out.println(isspring);
	}
}
	
	