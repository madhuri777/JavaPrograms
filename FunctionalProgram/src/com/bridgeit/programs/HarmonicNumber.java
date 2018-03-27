package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		float sum1=0;
		Utility un=new Utility();
		System.out.println("Enter the number");
		int N=un.inputInteger();
		if(N==0) {
			System.out.println("please enter the greater than zero value");
		}else {
			sum1=Utility.harmonicseries(N);	
		}
		System.out.println("the sum of harmonic series is:"+sum1);
	}

}
