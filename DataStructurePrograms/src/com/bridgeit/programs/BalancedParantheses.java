package com.bridgeit.programs;


import com.bridgeit.utility.Utility;

public class BalancedParantheses {

	public static void main(String[] args) {
		
		Utility utility=new Utility();
		
       System.out.println("Enter the Arthmatic expresion");
	   String expresion=utility.inputString();
	   
	   System.out.println("Expresion is:"+expresion);
	   Utility.checkParantheses(expresion);
	}

}
