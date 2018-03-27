package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
       Utility utility=new Utility();
		System.out.println("Enter the no of element:");
       int N=utility.inputInteger();
       System.out.println("sorting for:1.integer 2.string");
       int ch=utility.inputInteger();
       switch(ch) {
       case 1:
    	   Integer[] array=new Integer[N];
    	   for(int i=0;i<N;i++){
   			array[i]=utility.inputInteger();
   		}Utility.bubbleSortMethod(array);
   		break;
       case 2:
    	   String[] array2=new String[N];
		for(int i=0;i<N;i++){
			array2[i]=utility.inputString();
		}
		
		Utility.bubbleSortMethod(array2);
       }
	}

}
