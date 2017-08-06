
/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.Prime n
 *  
 *  Purpose: Determines whether entered number  n is prime.
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;
class Prime{
	public static void main(String args[]){
		/*
		/* number is given by user is accepted as args[0] as string ,args[0] is converted to integer using Integer.parseInt(args[0])
		*/
		int num=Integer.parseInt(args[0]);
		System.out.println("entered number is=="+num);	
			if(num==1||num==0){
					System.out.println("Entered is not prime");
			}/* try number given by user from 2 to entered number */			
			for(int i=2;i<num;i++){
				 /*check condition if number is having remainder ==0
				if number is divisible&remainder=0 hence it is non-prime*/
				if(num%i==0){
					System.out.println("entered is not prime");    
					break;
				}
				else{					//numberis not div by 2 hence prime
					System.out.println(" is prime");
					break;
				}
			}//end of for loop				
	}
}
		
			

