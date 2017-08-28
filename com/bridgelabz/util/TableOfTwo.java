/******************************************************************************
 *  Compilation:  javac -d bin TableOfTwo.java
 *  Execution:    java -cp bin com.bridgelabz.util.TableOfTwo n
 *  
 *  Purpose: 	This program takes a command-line argument N and prints a table of the 			powers of 2 that are less than or equal to 2^N.
 *  @author  ragini patil
 *  @version 1.0
 *  @since   28-08-2017
 *
 ******************************************************************************/

 package com.bridgelabz.util;
	
	public class TableOfTwo{
	static int num; 
		public static void main(String[] args){
			double j;
			num=Integer.parseInt(args[0]);

			if(num>0&&num<=31){
				for(int i=1;i<=num;i++){
					j=Math.pow(2,i);
					System.out.println(i+"      "+j);
				}
			}
		}
}
