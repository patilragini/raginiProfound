/******************************************************************************
 *  Compilation:  javac -d bin PrintUsername.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrintUsername
 *  
 *  Purpose:  takes username and print hello <username >, how are you
 *  @author  ragini patil
 *  @version 1.0
 *  @since   28-08-2017
 *
 ******************************************************************************/
 
package com.bridgelabz.util;

import java.util.Scanner;

class PrintUsername{
	public static void main (String args[]){
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.println("Enter User name:");
		name=sc.next();
		System.out.println("  Hello "+name+",How are you?");
		
		
	}
}
		
