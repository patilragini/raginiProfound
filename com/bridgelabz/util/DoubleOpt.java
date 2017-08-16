/******************************************************************************
 *  Compilation:  javac -d bin DoubleOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.DoubleOpt n n n 
 
 *  Purpose: 	takes 3 double input number and gives result of different operator and do operations
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

class DoubleOpt{
	static double input1,input2,input3,result1,result2,result3;
    public static void main(String[] args){
		input1=Double.parseDouble(args[0]);
		input2=Double.parseDouble(args[1]);
		input3=Double.parseDouble(args[2]);
		result1 = (input1 + input2 * input3);
        result2 = (input1 * input2 + input3);
        result3 = (input1 % input2 + input3); 
		//print results of operations
		//operator * has more precedence first multiplication then addition
		System.out.println("result of" +input1+ " + " +input2+ " * " +input3+ " = " +result1);
		//operator * has more precedence first multiplication then addition
		System.out.println("result of" +input1+ " * " +input2+ " + " +input3+ " = " +result2);
		//operator % has more precedence first mod gives remainder then addition of remainder and input3
		//operator % has more precedence first mod gives remainder then addition of remainder and input3
        System.out.println("result of"+input1+" % "+input2+" + "+input3+" = "+result3);     
    }
 }


    


    
    

