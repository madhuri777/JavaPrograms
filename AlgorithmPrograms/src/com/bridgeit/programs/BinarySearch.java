package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class BinarySearch {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("enter the no of elements");
		int N=utility.inputInteger();
	       System.out.println("sorting for:1.integer 2.string");
	       int ch=utility.inputInteger();
	       switch(ch) {
	       case 1:
	    	   System.out.println("enter the value in ascending order only:");
	    	   Integer[] array=new Integer[N];
	    	   for(int i=0;i<N;i++){
	   			array[i]=utility.inputInteger();
	   		}
	    	System.out.println("enter the key value:");
	    	int key=utility.inputInteger();
	    	//Utility.insertionSort(array);
	    	Utility.binarySearch(array,key,0,N-1);
	   		break;
	       case 2:
	    	   System.out.println("enter the value in ascending order only:");
	    	   String[] array2=new String[N];
			for(int i=0;i<N;i++){
				array2[i]=utility.inputString();
			}
			System.out.println("enter the key value");
			String key1=utility.inputString();
			Utility.binarySearch(array2,key1,0,N-1);
			break;
	       }
	}

}
