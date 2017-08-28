/****************************************************************************** 
 *  Purpose: Generate non repeating Random coupon 
 *  @version 1.0
 *  @since   28-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.*;

	public class Coupon{
		static int j;
		public static void main(String args[]){
			Scanner n= new Scanner(System.in);
			int num=n.nextInt();
			for(j=0;j<num;j++){
				int i=(int)(Math.random()*1000+j); 
				System.out.println(i);
			}
			
	}
}
