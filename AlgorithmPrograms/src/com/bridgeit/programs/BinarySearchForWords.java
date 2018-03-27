              package com.bridgeit.programs;

import java.io.FileReader;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class BinarySearchForWords {

	public static void main(String[] args)throws Exception {
       Utility utility=new Utility();
		String whole="";
	    Scanner sc=new Scanner(new FileReader("madhuri.txt"));
	    while(sc.hasNext()) {
	    String	words1=sc.next();
	    whole=whole+" "+words1;
	    System.out.println(words1);
	    }
	    String[] array= whole.split(" ");
	    int l=array.length;
	    System.out.println("Enter the any word for search");
	    String key=utility.inputString();
	      //String[] array2;
	     Utility.binarySearch(array,key,0,l-1);
	    sc.close();
	}
	}

