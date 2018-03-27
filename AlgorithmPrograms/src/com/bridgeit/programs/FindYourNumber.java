package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class FindYourNumber {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter your number:");
		int N=utility.inputInteger();
		int number=(int)Math.pow(2,N);
		System.out.println("Total numbers are:"+number);
		Integer[] array=new Integer[number];
		int j=1,k=0;
		while(j<number-1) {
		for( k=0;k<number-1;k++) {
			array[k]=j;
			j++;
		}
		}
		for(int z=0;z<number-1;z++) {
		System.out.println(array[z]);
		}
		int l=0;
		int h=array.length;
		//System.out.println(h);
		System.out.println("Enter the search key");
		int key=utility.inputInteger();
		Utility.binarySearch(array, key, l, h-1);
		
		}

}
