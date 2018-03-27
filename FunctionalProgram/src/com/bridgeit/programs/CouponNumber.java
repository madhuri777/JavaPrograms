package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class CouponNumber {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the any number:");
		int N=utility.inputInteger();
		System.out.println("Count is:"+Utility.couponNumberProgram(N));
	}

}
