/******************************************************************************
 *  Compilation:  javac -d bin RepeatedNum.java
 *  Execution:    java -cp bin com.bridgelabz.util.RepeatedNum
 *  
 *  Purpose: 	To find repeated number  entered by user
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.util.*;

public class RepeatedNum{
	//main function to execute repeatednum class
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int i,j;
		int array[]=new int[10];		//array decelaration of size 10 of integer format
		for(i=0;i<10;i++){		//take 10 input number from user 
			int num = s.nextInt();		//take integer number
			array[i]=num;		//store num in array on ith position
		}
		for(i=0;i<10;i++){
			for(j=i+1;j<10;j++){
				//compare ith elememt with jth element
				if(array[i]==array[j]){
					System.out.println("repeated number is ="+array[i]); 
				}//end of if
			}
		}
	}
}