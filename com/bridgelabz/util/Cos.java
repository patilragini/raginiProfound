/******************************************************************************
 *  Compilation:  javac -d bin Cos.java
 *  Execution:    java -cp bin com.bridgelabz.util.Cos
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
	
public class Cos{
	static double x,cosx=1,fact1,temp,value;
	static int term,j=0;
	public static int factorial(int n){
		if(n==1)
			return 0;
		int fact=1;
		for(int i=1;i<=n;i++){
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		x = Double.parseDouble(args[0]);
		x = x % (2*Math.PI);
		System.out.println("Enter the no. of terms:");
		term = scanner.nextInt();
		term--;
		while(j<=term){
			for(int i=2;term!=0;i=i+2){
				value = factorial(i);
				fact1 = Math.pow(x,i);
				temp = value/fact1;
				if (i % 4 == 0){
					cosx += temp;
				}
				if (i % 4 == 2){
					cosx -= temp;
				}
				term--;
				}
				j++;
			}
		System.out.println("The value of cosx is " +cosx);
	}
	
}