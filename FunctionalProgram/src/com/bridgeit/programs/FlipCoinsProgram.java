package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class FlipCoinsProgram {

	public static void main(String[] args) {
		Utility un=new Utility();
		System.out.println("Enter number of times to flip coin");	    
	    int c=un.inputInteger();
	    if(c>0) {
	  Utility.flipCoin(c);
	    }else {
	    	System.out.println("please enter the +ve integer");
	    }
	    
     }
	}
