
/******************************************************************************
 *  Compilation:  javac -d bin Quadratic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Quadratic 
 *  
 *  Purpose: Determines whether entered  Quadratic equation is imaginary and find roots of equation
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.util.Scanner;

public class Quadratic{
	static int a,b,c;
	static double r1,r2,d;
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println(" give quadratic equation =ax^2 +bx +c");
		System.out.println("enter a: b: c:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("given quadratic eqn is:"+a+" x^2 +"+b+"x+"+c);
		d=b*b-4*a*c;
		if(d>0){
			System.out.println("roots are real and unequal");
			r1=(-b+Math.sqrt(d)/(2*a));
			r2=(-b-Math.sqrt(d)/(2*a));
			System.out.println("1st root is "+r1);
			System.out.println("2nd root is "+r2);
		}
		else if (d==0){
			System.out.println("1st root are real and eqal");
			r1=(-b+Math.sqrt(d)/(2*a));
			System.out.println("root:"+r1);
		}
		else{
			System.out.println("imaginary root:");
		}
	}
}