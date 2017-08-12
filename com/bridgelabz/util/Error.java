/******************************************************************************
 *  Compilation:  javac -d bin Error.java
 *  Execution:    java -cp bin com.bridgelabz.util.Error
 *  
 *  Purpose: 	show run time error 
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class Error{
	/* 
	 *main method is not present hence will cause run time error 
	 */ 
	public static void display(String args[]){
	//simple print statement
	System.out.println("hello world");
	}
}