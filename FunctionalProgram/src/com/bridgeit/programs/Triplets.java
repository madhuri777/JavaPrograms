package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Triplets {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("enter number of elements:");
		int n=utility.inputInteger();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=utility.inputInteger();
		}
		System.out.println(Utility.tripletProgram(arr,n));
	}

}
