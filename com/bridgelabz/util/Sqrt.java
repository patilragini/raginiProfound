
/******************************************************************************
 *  Compilation:  javac -d bin Sqrt .java
 *  Execution:    java -cp bin com.bridgelabz.util.Sqrt 
 *  
 *  Purpose: Computes the square root of a nonnegative number c using
 *  	  Newton's method:
 *     - initialize t = c
 *     - replace t with the average of c/t and t
 *     - repeat until desired accuracy reached
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   12-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class Sqrt { 
	static double c,epsilon,t;
    public static void main(String[] args) { 
		c = Double.parseDouble(args[0]);
		epsilon = 1e-15;    // relative error tolerance
        t = c;              // estimate of the square root of c
        // repeatedly apply Newton update step until desired precision is achieved
		//
		if(c>=0){
			while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
			}
		}
		else  System.out.println("invalid number");
        // print out the estimate of the square root of c
        System.out.println(t);
    }

}
