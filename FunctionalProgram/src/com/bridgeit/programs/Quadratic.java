package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		Utility un=new Utility();
		System.out.println("Enter quadratic  equation");
		int a=un.inputInteger();
		int b=un.inputInteger();
		int c=un.inputInteger();
		
		Utility.rootsOfEqutn(a,b,c);
	}

}
