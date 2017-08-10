/******************************************************************************
 *  Compilation:  javac -d bin PowerOfTow.java
 *  Execution:    java -cp bin com.bridgelabz.util.PowerOfTow n
 *  
 *  Purpose: take argument n and print tableof power of 2  less than equal to 2^n
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;

 public class PowerOfTow{
	public static void main(String[] args){
		int n =Integer.parseInt(args[0]);
		int i;
		if(n>=0&&n<31)						//overfloews int if greater than 31
			{
				
				for(i=0;i<=n;i++)
				{			
				System.out.print(i);
				System.out.print("\t"+Math.pow(2,i));
				System.out.println();
				}
			}
			
	}
}