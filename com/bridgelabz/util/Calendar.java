/********************************************************************************
 *Perpose:  Give Day Of Week that takes a date as input and
 *           returns the day of week that date falls on using functions  
 *@author: Ragini Patil
 *@version: 1.8
 *@since: 19-08-2017
 ********************************************************************************/

package com.bridgelabz.util;

class Calendar {

    //Static function that calculate the date falls on
    static int dayOfWeek(int mYear,int mMonth, int mDay){

        //Calculate the date fall on
        int y = mYear - (14 - mMonth) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = mMonth + 12 * x * ((14 - mMonth) / 12) - 2;
        int d = (mDay + x + 31 * m / 12) % 7;

        //returns falllon date
        return d;
    }
    public static void main(String args[]){

        //prints and call the static fucntion
        System.out.println(dayOfWeek(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])));
    }
}