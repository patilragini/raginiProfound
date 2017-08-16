/******************************************************************************
 *  Compilation:  javac -d bin  Sin.java
 *  Execution:    java -cp bin com.bridgelabz.util. Sin
 *  
 *  Purpose: Determines whether month and date is spring or not
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class Sin{

	static double Sinx,x,fact1,value,temp;
	static int term,j=0;
	
		/*
		* function returns an integer value containing fatorial value of n. 
		* but function returns 0 when n is equal to one.
		* 
		*/	
    	public static int factorial(int n)	{
       		if(n==0){
				return 0;
    		}
			int fact=1; 
			for(int i=1;i<=n;i++){
				fact = fact*i;
			}
			return fact;
	}
	public static void main(String args[]){			
		Scanner s = new Scanner(System.in);
		x = Double.parseDouble(args[0]);
		x = x % (2*Math.PI);
		System.out.println("Enter the no. of terms:");
		term = s.nextInt();
		Sinx=x;
		term--;
		while(j<=term){
			for(int i=3;term!=0;i=i+2){
			fact1 = factorial(i);
			value = Math.pow(x,i);
			temp = value/fact1;
			if (i % 4 == 1){
				Sinx += temp;
			}
			if (i % 4 == 3){
				Sinx -= temp;
			}
			term--;
			}
			j++;
		}
		System.out.println("The value of sinx is " +Sinx);
		}
}		