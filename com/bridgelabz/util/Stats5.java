
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
import java.util.Random;

public class Stats5{    
    	public static void main(String args[]){
            double[] number = new double[5];
			double sum = 0;
			/* start giving 5 random sample between 0 and1 */
			for(int i=0;i<5;i++){           
				number[i] = Math.random();
			}
			for(int i = 0; i<=4;i++){
				System.out.println(number[i]);
				sum = sum+number[i];
			}
			System.out.println("The Sum of 5 random value = " +sum);
			double largest = Math.max(number[0],Math.max(number[1],Math.max(number[2],Math.max(number[3],number[4]))));
			double smallest =Math.min(number[0],Math.min(number[1],Math.min(number[2],Math.min(number[3],number[4])))); 

			 
			System.out.println("Minimum of the 5 generated values = "+smallest);
			System.out.println("Maximum of the 5 generated values = "+largest);
		}
}