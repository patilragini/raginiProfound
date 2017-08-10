/******************************************************************************
 *  Compilation:  javac -d bin TemperatureConversion .java
 *  Execution:    java -cp bin com.bridgelabz.util.TemperatureConversion n n
 
 *  Purpose: accept celcius and fahrenhite from user and convert 
			 celcius to fahrenhite and vice versa
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

public class TemperatureConversion{
    public static void main(String[] args) {
      	Scanner scan=new Scanner(System.in);
		/* tempCel,tempFar are given by user  accepted as args[0] args[1]args[2]as string ,args[] is converted to integer using 
		Integer.parseInt(args[]) and stored in variables tempCel,tempFar resoectively */
		int tempCel= Integer.parseInt(args[0]);
		int tempFar= Integer.parseInt(args[1]);
		System.out.println();
		System.out.println("The Entered value of Celsius is " +tempCel+ " and Fahrenhite is " +tempFar);
		System.out.println();    
		System.out.println("MENU:");		//display menu tu user 
		System.out.println("1. Celcius to Fahrenhite");  
		System.out.println("2. Fahrenhite to Celcius");
		System.out.println();
		System.out.println("Enter your choice");
		/*accept choice form user using nextInt() and store int value in reslut variable*/
		int Result=scan.nextInt();		
		System.out.println("the entered choice is " +Result);		//print choice entered by user
		//result is used to have different case
		switch(Result){
			//if result=1 then case 1 execute
			case 1: int ResultFar = (tempCel*9/5)+32;		//formula of celcius to fahrenhite
				System.out.println(" The" +tempCel+" in celcius is converted to " +ResultFar+ "in Fahrenhite");
				break;//break come out of switch.

			case 2: int ResultCel =(tempFar-32)*5/9;		//formula of fahrenhite to celcius 
				System.out.println(" The" +tempFar+ "in Fahrenhite is converted to " +ResultCel+ "in Celcius");
				break;//break come out of switch.
			default: System.out.println("invalid entry");	//if result is not in case,come out of switch print
		}
	}
}

     
    
    
    

