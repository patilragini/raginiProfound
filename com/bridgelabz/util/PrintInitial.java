/******************************************************************************
 *  Compilation:  javac -d bin PrintInitial.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrintInitial
 *  
 *  Purpose: 
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;

class PrintInitial{
	public static void main (String args[]){
		String a;
		System.out.println("enter initial a b d or l ");
		//System.out.println("	");
		a=args[0];
		switch(a){
			case "a": System.out.println("        ***        ");
					  System.out.println("       ** **       ");
				      System.out.println("      **   **      ");
				      System.out.println("     **     **     ");
				      System.out.println("    ***********    ");
				      System.out.println("   *************   ");
				      System.out.println("  **           **  ");
				      System.out.println(" **             ** ");
				      System.out.println("**               **");

							break;
			case "b":
				System.out.println("*******		");
				System.out.println("**    **	");
				System.out.println("**      **	");
				System.out.println("**     **	");
				System.out.println("*******	    ");
				System.out.println("*******	    ");
				System.out.println("**    **	    ");
				System.out.println("**      **	");
				System.out.println("**    **	    ");
				System.out.println("******	    ");
			break;
			case "d":
				System.out.println("******		");
				System.out.println("**    **	");
				System.out.println("**     **	");
				System.out.println("**      **	");
				System.out.println("**      **	");
				System.out.println("**      **	");
				System.out.println("**     **	");
				System.out.println("**     **	");
				System.out.println("**    **	");
				System.out.println("******	    ");
			break;
			case "l":
				System.out.println("**		    ");
				System.out.println("**	        ");
				System.out.println("**	        ");
				System.out.println("**	        ");
				System.out.println("**			");
				System.out.println("**			");
				System.out.println("**			");
				System.out.println("**			");
				System.out.println("*********	");
				System.out.println("*********	");
			break;
			default :
			    System.out.println("invalid entry	");
		}
	}
}