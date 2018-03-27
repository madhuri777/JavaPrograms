package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class TwosPower {

	public static void main(String[] args) {
		Utility un=new Utility();
		System.out.println("Enter the value");
		int N=un.inputInteger();
		Utility.poweOfTwo(N);
	}

}
