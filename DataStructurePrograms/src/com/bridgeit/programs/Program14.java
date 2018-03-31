package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Program14 {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the number:");
		int n=utility.inputInteger();
		Utility.prime2D(n);
	}

}
