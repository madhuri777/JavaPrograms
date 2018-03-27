package com.bridgeit.programs;

import java.io.FileReader;
import java.util.Scanner;

import com.bridgeit.utility.LinkedList1;
import com.bridgeit.utility.Utility;

public class UnOrderedList1 {

	public static void main(String[] args) throws Exception {
		LinkedList1 list=new LinkedList1();
		String whole=null;
		Scanner sc=new Scanner(new FileReader("LinkedList.txt"));
	    while(sc.hasNext()) {
	    String	words1=sc.next();
	   // whole=whole+" "+words1;
	    //System.out.println(words1);
	    list.add(words1);
	    }
	    //String[] array= whole.split(" ");
	    //list.add(array);
	    //int l=array.length;
	   // System.out.println(l+"lenght is");
        list.show();
	}

}
