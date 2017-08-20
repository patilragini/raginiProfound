/*************************************************
 *Perpose: show Mathematical Functions like Sin,Cos,binary Number ,square root etc
 *
 *@author:Patil Ragini
 *@version: 1.8
 *@since: 19-08-2017
 **************************************************/

package com.bridgelabz.util2;
import java.util.*;
class MathFunctions{
	/* harmonic function */
    public static  double harmonic(int given){

        float i = 1;

        double mHarmonicNumber = 0;

        int mNthNumber = given;

        while(i <= mNthNumber) {
            System.out.print("+");
            mHarmonicNumber = mHarmonicNumber + (1/i) ;
            System.out.print("1/"+i);
            i++;
        }
        return mHarmonicNumber;
    }
	/*Sin function*/
    public static double Sin(int number){
        double radians = Math.toRadians(number);

        double mSin = Math.sin(radians);
        return mSin;
    }
	/*cosin function*/
    public static double Cos(int number){
        double radians = Math.toRadians(number);

        double mCos = Math.cos(radians);
        return mCos;
    }
	/*Binary function*/
    public static String binaryNumber(int number) {

        int nNumber = number;

        String binary = "";

        int mReminder;

        while(nNumber > 0) {
            mReminder = nNumber % 2;
            nNumber = nNumber / 2;
            binary+=mReminder;
        }
        return binary;
    }
	/* square root 1 parameter*/
    public static double findSqrt(double number){
        double mNumber = number;

        double epsilon = 1e-15;

        double t = mNumber;

        while (Math.abs(t - mNumber/t) > epsilon*t) {
            t = (mNumber/t + t) / 2.0;
        }

        return t;
    }
	/*sqrt 2 parameter*/
    public static double findSqrt(double number,double epsilon){
        double mNumber = number;

        double t = mNumber;

        while (Math.abs(t - mNumber/t) > epsilon*t) {
            t = (mNumber/t + t) / 2.0;
        }

        return t;
    }
	/*prime number function*/
    public static boolean isPrime(int number) {
        boolean isPrimeNumber = false;
        int flag = 0;
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    flag++;
                }
            }
            if (flag == 2) {
                isPrimeNumber = true;
                return isPrimeNumber;
            }
            else
                return isPrimeNumber;
        }
        else
            return isPrimeNumber;
    }
	/*	Factorial function*/
    public static long factorial(int number){
        long mNumber = 1;
        while(number >= 1){
            mNumber = mNumber * number;
            number--;
        }
        return mNumber;
    }

    public static double futureValue(double doller, double rate, double period){

        double mFutureValue = doller * (Math.pow((1 + rate), period));

        return mFutureValue;
    }

    public static double presentValue(double doller, double rate, double period){
        double mPresentValue = doller / (Math.pow((1 + rate), period));

        return mPresentValue;
    }

	/* MAX Value from array*/
   public static int maxValue(int[] numbers) {

        int mLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > mLargest) {
                mLargest = numbers[i];
            }
        }

        return mLargest;
    }
	/*min function to calculate min value in array*/
    public static int minValue(int[] numbers) {

        int mSmallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < mSmallest) {
                mSmallest = numbers[i];
            }
        }

        return mSmallest;
    }
	/*************/
    public static int minValue(String mNumbers[]) {

        int[] numbers = new int[mNumbers.length];

        for (int i = 0; i < mNumbers.length; i++) {
            numbers[i] = Integer.parseInt(mNumbers[i]);
        }

        int mSmallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < mSmallest) {
                mSmallest = numbers[i];
            }
        }
        return mSmallest;
    }
	/*****************/
    public static int maxValue(String mNumbers[]) {

        int[] numbers = new int[mNumbers.length];

        for (int i = 0; i < mNumbers.length; i++) {
            numbers[i] = Integer.parseInt(mNumbers[i]);
        }
        int mLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > mLargest) {
                mLargest = numbers[i];
            }
        }
        return mLargest;
    }
	/* calcuate colliner using slope */
    public static boolean checkCollinearUsingSlop(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slopeAB = (y2 - y1) / (x2 - x1);
        int slopeBC = (y3 - y2) / (x3 - x2);
        int slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAC == slopeAB && slopeAB == slopeBC;
    }
	/* calcuate colliner using triangle*/
    public static boolean checkCollinearUsingTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        boolean isCollinear = false;

        int a = x1 - x2;
        int b = x2 - x3;
        int c = y1 - y2;
        int d = y2 - y3;

        int area = (a * d) - (b * c);

        area = 1/2 * area;

        if(area == 0)
            isCollinear = true;

        return isCollinear;
    }

    public static void main(String args[]){
	int a=Integer.parseInt(args[0]);
	System.out.println( harmonic(a));
	System.out.println();
	System.out.println("SIN VALUE = "+Sin(a));
	System.out.println();
	System.out.println("Cosin Value = "+Cos(a));
	System.out.println();
    System.out.println("Binary value of "+a+" is "+binaryNumber(a));
	System.out.println();
	System.out.println(a+""+isPrime(a));
	System.out.println();
	double b=Double.parseDouble(args[1]);	
	double epsilon=1e-15;
	System.out.println("one parameter");
	System.out.println(findSqrt(a));
	System.out.println("2 parameter");
	double ans=findSqrt(a,epsilon);
	System.out.println(ans);
	System.out.println();
    System.out.println("factorial of "+a+"is= "+factorial(a));
	Scanner sc = new Scanner(System.in);
	System.out.println("enter Dollar Rate and period to calculate present future value ");
	double d= sc.nextDouble();
	double r= sc.nextDouble();
	double p= sc.nextDouble();
	double value;
	value=presentValue(d,r,p);
	System.out.println();
    System.out.println("present value ="+value);
	value=futureValue(d,r,p);
	System.out.println();
    System.out.println("future value ="+value);
	/*ARRAY DECLERATION  */
	int number[]={1,5,10,2,30,50,5};
	int min=minValue(number);
	int max=maxValue(number);
	System.out.println();
    System.out.println("minimum value ="+min+"  max value="+max);
	
	/*string snum
	String snum={"a","b",""c};
	String smin= minValue(snum);
	String smax= maxValue(snum);
	System.out.println();
    System.out.println("minimum value ="+smin+"  max value="+smax);
	*/
	int x1=2;
	int x2=3;
	int x3=4;
	int y1=20;
	int y2=30;
	int y3=40;
	System.out.println();
    System.out.println(" colliner using slope "+checkCollinearUsingSlop(x1,y1,x2,y2,x3,y3));
	System.out.println(" colliner using triangle "+checkCollinearUsingTriangle(x1,y1,x2,y2,x3,y3));
    }
}