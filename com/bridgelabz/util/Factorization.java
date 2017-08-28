/*************************************************
 *Perpose: factotrazation by brute force
 *
 *@author:Patil Ragini
 *@version: 1.8
 *@since: 28-08-2017
 **************************************************/

package com.bridgelabz.util;
import java.util.*;

public class Factorization {
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        System.out.print("The prime factorization of " + n + " is: ");
        // for each potential factor
        for (int factor = 2; factor*factor <= n; factor++) {
            // if factor is a factor of n, repeatedly divide it out
            while (n % factor == 0) {
                System.out.print(factor + " "); 
                n = n / factor;
            }
        }
        // if biggest factor occurs only once, n > 1
        if (n > 1) System.out.println(n);
        else       System.out.println();
    }
}

