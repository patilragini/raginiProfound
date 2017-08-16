/******************************************************************************
 *  Purpose: Taking range of number as input and outputs the Prime Numbers 
 *  in that range.
 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since  10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class PrimeNumberInRange{
	static int range,count;
	public static void main(String args[]){
		int range = Integer.parseInt(args[0]);
        int count;
		for(int i = 1; i <= range; i++){
			count = 0;
			for(int j=2 ; j<=i/2 ; j++){
				if(i % j == 0){
					count++;
				}
			}
            if(count==0 && i!= 1)
				System.out.println(i);
        }
    }
}