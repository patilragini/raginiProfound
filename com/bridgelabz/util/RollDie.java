/********************************************************************************
*Perpose: Dice Roll and find Which side comes maximum time. 
*
*@author: Ragini Patil
*@version: 1.8
*@since: 13-08-2017
********************************************************************************/

package com.bridgelabz.util;

import java.util.Random;

class RollDie {
	static int n;
	public static void main(String args[])	{
        Random random = new Random();  
        int Number= Integer.parseInt(args[0]);
        int mDice[] = new int[n];       
        int Side1 = 0, Side2 = 0, Side3 = 0, Side4 = 0, Side5 = 0, Side6 = 0;
       
        for(int i = 0; i < n; i++) 	{
            mDice[i] =( random.nextInt(6) + 1);

            	switch (mDice[i]){
                case 1: Side1++;
                        break;
                case 2: Side2++;
                        break;
                case 3: Side3++;
                        break;
                case 4: Side4++;
                        break;
                case 5: Side5++;
                        break;
                case 6: Side6++;
                          break;
				}
        }
        
        
        CheckSide(Side1,Side2,Side3,Side4,Side5,Side6);
	}

   	//Displays which Side Comes more times and prints output
  	public static void CheckSide(int S1,int S2,int S3,int S4,int S5,int S6)	{
        if(S1 >= S2 && S1 >= S3 && S1 >= S4 && S1 >= S5 && S1 >= S6)
            System.out.println("Max no. of appearance of side 1 is "+S1);

        if (S2 >= S1 && S2 >= S3 && S2 >= S4 && S2 >= S5 && S2 >= S6)
            System.out.println("Max no. of appearance of side 2 is "+S2);

        if (S3 >= S1 && S3 >= S2 && S3 >= S4 && S3 >= S5 && S3 >= S6)
            System.out.println("Max no. of appearance of side 3 is "+S3);

        if (S4 >= S1 && S4 >= S2 && S4 >= S3 && S4 >= S5 && S4 >= S6)
            System.out.println("Max no. of appearance of side 4 is "+S4);

        if (S5 >= S1 && S5 >= S2 && S5 >= S3 && S5 >= S4 && S5 >= S6)
            System.out.println("Max no. of appearance of side 5 is "+S5);

        if (S6 >= S1 && S6 >= S2 && S6 >= S3 && S6 >= S4 && S6 >= S5)
            System.out.println("Max no. of appearance of side 6 is "+S6);
    }
}