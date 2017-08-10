
/******************************************************************************
 *  Compilation:  javac -d bin Stats5.java
 *  Execution:    java -cp bin com.bridgelabz.util.Stats5 n
 *  
 *  Purpose: print n random values from 0 to 1, print maximum,minimum,average pf samples
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.util.*;

public class Stats5{
	/*
    * The main function is written to test Random class
    */
	public static void main(String args[]){
		//n is varable to store number of random sample required by user as args[0]
		int n=Integer.parseInt(args[0]);
		double total=0,b;
		double avg=0,max=0;
		/*a[] is an array to store all random numbers generated. New is used to allocate memeory.
		n is the size of array.*/
		double a[]=new double[n];
		/* start givingn random sample between 0 and1 */
		for(int i=0;i<n;i++){
			/* Math.random is mathematical function in lang package for taking giving random numbers
			between 0 and 1*/
			a[i]=(Math.random()*1000);
			b=a[i];		// b varable stores   a[i]th value
			/* max variable store maximum value given from Math.max(b and max)  */
			max=Math.max(b,max);
			/* max gets an updated maximum value */
			
			//min=Math.min(b,a[i+1]);
			
			total = (b+total);/*total variable is used to store the total of random samples;
							  total get update in next itterartion*/
		}		//end of for loop
		avg=total/n;// average calculation total / n
		/* print all random samples*/
		for(int i=0;i<n;i++){
			System.out.println(+a[i]);
		}//end of for
		System.out.println("Average ="+avg);//print average of random samples
		//System.out.println("Minimum="+min);
		System.out.println("Maximum ="+max);//print maximum value of random samples
	}
}