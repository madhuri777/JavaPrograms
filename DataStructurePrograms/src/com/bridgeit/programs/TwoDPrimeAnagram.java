package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class TwoDPrimeAnagram {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("enter the number ");
		int n=utility.inputInteger();
		Utility.prime2D(n);
    
	}

}
