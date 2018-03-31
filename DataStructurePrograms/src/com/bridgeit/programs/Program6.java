package com.bridgeit.programs;

import java.io.FileReader;
import java.util.Scanner;

import com.bridgeit.utility.HashFunction;

public class Program6 {

	public static void main(String[] args)throws Exception {
		HashFunction hs=new HashFunction();
		Scanner sc=new Scanner(new FileReader("orderlist.txt"));

		 int i=0;
		 int[] array1=new int[10];
	     while(sc.hasNextInt()) {
	    	array1[i]=sc.nextInt();
	    	//System.out.print(" "+array1[i]+" ");
	    	 i++;
	     }
	     hs.hashMethod(array1);
	     
	}

}
