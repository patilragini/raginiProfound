/*************************************************
 *Perpose: Take month and year and Display calendar 
 *
 *@author:Patil Ragini
 *@version: 1.8
 *@since: 19-08-2017
 **************************************************/

package com.bridgelabz.util2;

import java.util.Scanner;

public class CalendarDisplay
{
    private static int numDays = 0;
    private static int h = 0;
    public static boolean leap(int year)
    {
        if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void firstDayOfYear(int year)
    {
        int month = 13;
        year--;
        h = (1 + (int)(((month + 1) * 26) / 10.0) + year + (int)(year / 4.0) + 6 * (int)(year / 100.0) + (int)(year / 400.0)) % 7;
        String dayName = "";
        switch(h)
        {
            case 0: dayName = "Saturday"; break;
            case 1: dayName = "Sunday"; break;
            case 2: dayName = "Monday"; break;
            case 3: dayName = "Tuesday"; break;
            case 4: dayName = "Wednesday"; break;
            case 5: dayName = "Thursday"; break;
            default: dayName = "Friday"; break;
        }
        System.out.println("The first day of the year is " + dayName);
    }
    public static void firstDayOfMonth(int month, int year)
    {
        if(month == 1 || month == 2)
        {
            month += 12;
            year--;
        }
        h = (1 + (int)(((month + 1) * 26) / 10.0) + year + (int)(year / 4.0) + 6 * (int)(year / 100.0) + (int)(year / 400.0)) % 7;
        String dayName = "";
        switch(h)
        {
            case 0: dayName = "Saturday"; break;
            case 1: dayName = "Sunday"; break;
            case 2: dayName = "Monday"; break;
            case 3: dayName = "Tuesday"; break;
            case 4: dayName = "Wednesday"; break;
            case 5: dayName = "Thursday"; break;
            default: dayName = "Friday"; break;
        }
        System.out.println("The first day of the month is " + dayName);
    }
    public static void numDaysInMonth(int month, int year)
    {
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (month == 2 && leap(year)) days[month] = 29;
        numDays = days[month];
        System.out.println("The number of days in the month is " + numDays);
    }
    public static void printCal(int month, int year)
    {
        String[] monthNames = {"","January","February","March","April","May","June","July","August","September","October","November","December"};

        System.out.println("    " + monthNames[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < h - 1; i++)
            System.out.print("   ");
        for (int i = 1; i <= numDays; i++)
        {
            System.out.printf("%2d ", i);
            if (((i + h - 1) % 7 == 0) || (i == numDays)) System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        if(month < 1 || month > 12)
        {
            System.out.println("Invalid month. Valids inputs are 1-12.");
            System.exit(0);
        }
        System.out.print("Enter year: ");
        int year = input.nextInt();
        if(year < 1753)
        {
            System.out.println("Invalid year. Valid inputs are 1753 and beyond.");
            System.exit(0);
        }
        if(leap(year))
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is NOT a leap year.");
        }
        firstDayOfYear(year);
        firstDayOfMonth(month, year);
        numDaysInMonth(month, year);
        printCal(month, year);
    }    
}