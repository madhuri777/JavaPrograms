package com.bridgeit.programs;

import java.io.FileReader;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class InsertionSort {

	public static void main(String[] args)throws Exception {
		String whole="";
		//int count=0;
		Scanner sc=new Scanner(new FileReader("madhuri.txt"));
	    while(sc.hasNext()) {
	    //	count++;
	    String	words1=sc.next();
	    whole=whole+" "+words1;
	    System.out.println(words1);
	    }
	    String[] array= whole.split(" ");
	    Utility.insertionSort(array);
	    sc.close();
	}

}
