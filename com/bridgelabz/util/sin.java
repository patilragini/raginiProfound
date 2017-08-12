
/******************************************************************************
 *  Compilation:  javac -d bin Sqrt .java
 *  Execution:    java -cp bin com.bridgelabz.util.Sqrt 
 *  
 *  Purpose: compute sin series
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   12-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class sin {

    public static void main(String[] args) { 
        double x = Double.parseDouble(args[0]);

        // convert x to an angle between -2 PI and 2 PI
        x = x % (2 * Math.PI);

        // compute the Taylor series approximation
        double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // sum of first i terms in taylor series

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        System.out.println(sum);
    }
}
