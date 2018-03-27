package com.bridgeit.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgeit.utility.LinkedList1;
import com.bridgeit.utility.Utility;

public class UnOrderedList1 {

	public static void main(String[] args) throws Exception {
		Utility utility=new Utility();
		LinkedList1 list=new LinkedList1();
		
		Scanner sc=new Scanner(new FileReader("www.txt"));
		
		String words=null;
		String whole=null;
		
		while(sc.hasNext()) {
			words=sc.next();
			 whole=whole+" "+words;
			list.add(words);
		}
		System.out.println("Show method before searching any word:");
		list.show();
		
		System.out.println("Enter the search key:");
		String item=utility.inputString();
		
		boolean flage=list.search(item);
		if(flage==true) {
			list.remove(item);
		}else {
			list.add(item);
		}
		list.show();
	}

}
