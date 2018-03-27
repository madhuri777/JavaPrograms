package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PrimeFactor {

	public static void main(String[] args) {
		Utility un=new Utility();
		System.out.println("Enter the number to find the prime factor");
		int N=un.inputInteger();
		Utility.primeFactProgm(N);
	}

}
