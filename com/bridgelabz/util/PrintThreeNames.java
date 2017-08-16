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
import java.util.Scanner;

class PrintThreeNames{
	public static void main (String args[]){
		Scanner sc= new Scanner(System.in);
		String[] nameArray = new String[3];
		System.out.println("Enter three names:");
		for(int i=0;i<3;i++){
			nameArray[i]=sc.next();
		}
		System.out.println("  Hi  ");
		
		for(int i=2;i>=0;i--){
			System.out.print(" "+nameArray[i]);
		}
	}
}
		
