/****************************************************************************** 
 *  Purpose: iven N distinct Coupon Numbers, how many random numbers do you need to 
	generate distinct coupon number? This program simulates this random process.

 *
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;

import java.util.Scanner;
import java.util.Random;

public class CouponNumbers {

	int[] couponArray;	//array to store numbers
	int  pos = 0;		//position to which the new generated number is to be added
	int randomCount = 0;	//keeps number of trials required
	public static void main(String[] args){
		CouponNumbers couponNumbers = new CouponNumbers();	//object of class
		couponNumbers.getcpn();
		
	}
	void getcpn() {
		Scanner scanner = new Scanner(System.in);	
		System.out.print("Enter Number of Coupons: ");//take no of coupon 
		int couponCount = scanner.nextInt();
		couponArray = new int[couponCount]; 	// array of size couponcount
		random(couponCount);
	}

	/* generate random numbers 
	add numbers to the array */
	void random(int couponCount){ 
		randomCount++;
		Random random = new Random();
		int randomInteger = random.nextInt(couponCount) + 1;
		if(isPresent(randomInteger))
			random(couponCount);
		else{
			couponArray[pos] = randomInteger;
			pos++;
			if(pos == couponCount){
				System.out.println("Number of trials required: " + randomCount);
				return;
			}
			random(couponCount);
		}
	}

	/** checks if the generated number has occurred before **/
	boolean isPresent(int n){
		for(int i =0; i < couponArray.length; i++){
			if(couponArray[i] == n)
				return true;
		}
		return false;
	}
}
