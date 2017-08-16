/******************************************************************************
 *  Compilation:  javac -d bin IntOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.IntOpt n n n 
 
 *  Purpose: 	takes 3 integer input number and gives result of different operator and do operations
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;

class IntOpt {
    static int= input1,input2,input3,result1,result2,result3;
    public static void main(String[] args){
		input1=Integer.parseInt(args[0]);
		input2=Integer.parseInt(args[1]);
		input3=Integer.parseInt(args[2]);
		/*result1,result2,result3 double variable are used to store different calculations*/
	 	result1 = (input1 + input2 * input3);
		result2 = (input1 * input2 + input3);
		result3 = (input1 % input2 + input3); 
		//print results of operationn
		//operator * has more precedence first multiplication then addition
		System.out.println("result of " +input1+ " +  " +input2+ "  * " +input3+ " = " +result1);
		//operator * has more precedence first multiplication then addition
		System.out.println("result of " +input1+ " *  " +input2+ "  + " +input3+ " = " +result2);
		//operator % has more precedence first mod gives remainder then addition of remainder and input3
        System.out.println("result of "+input1+" %  "+input2+"  + "+input3+" = "+result3);     
	}
}


    


    
    

