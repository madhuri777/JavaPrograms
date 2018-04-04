package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Palindrom {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the string:");
		String str=utility.inputString();
		Utility.palindromChecker(str);

	}

}
