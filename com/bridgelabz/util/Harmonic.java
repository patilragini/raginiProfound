/******************************************************************************
 *  Compilation:  javac -d bin Harmonic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Harmonic n
 *  
 *  Purpose:      Print  harmonic series upto n entered by user
 *  @author  ragini patil
 *  @version 1.0
 *  @since   12-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;

 public class Harmonic{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		/* traverser from 1 to n */
		for(int i=1;i<=num;i++){
			//System.out.println();
			System.out.print("1/"+i);	//print numerator as1 and denominator asi
			if(i<num){
				System.out.print("  +  ");
			}		//end of for
		}
		
	}
}
