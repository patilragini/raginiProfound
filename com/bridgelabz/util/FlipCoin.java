/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin
 *  
 *  Purpose: simulate a fair coin flip and print  "head " or "tail" accordingly
 *  @author  ragini patil
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/

 package com.bridgelabz.util;
 
public class FlipCoin{
	static int headctr,tailctr;
	public static void main(String[] args){
		//math.random() returns value between 0.0 and 1
		//so it is heads or tail 50% of time
		float h,t;
		int num=Integer.parseInt(args[0]);
		System.out.println("Number of flips="+num);
		for(int i=0;i<num;i++){
			if(Math.random()<0.5){
				System.out.println("Heads");//print head
				headctr=headctr+1;
			}
			else{
				System.out.println("Tails");//print tail
				tailctr++;
			}
		}
		System.out.println("Heads percentage"+headctr);
		System.out.println("Tails percentage"+tailctr);
		h=headctr;
		h=(h/num)*100;
		t=(tailctr);
		t=(t/num)*100;
		System.out.println("Heads percentage"+h+"%");
		System.out.println("Tails percentage"+t+"%");
	}//main end
}
