package com.bridgeit.programs;

import java.io.FileReader;
import java.util.Scanner;

import com.bridgeit.utility.LinkedList1;
import com.bridgeit.utility.Utility;

public class OrderedList {

	public static void main(String[] args)throws Exception {
		Utility utility=new Utility();
		LinkedList1 list= new LinkedList1();
     Scanner sc=new Scanner(new FileReader("orderlist.txt"));
    
     int i=0;
     while(sc.hasNextInt()) {
    	 i++;
    	 sc.next();
     }
    Scanner sc1=new Scanner(new FileReader("orderlist.txt"));
    Integer[] array=new Integer[i];
    for(int j=0;j<i;j++) {
    	array[j]=sc1.nextInt();
    }
    Utility.insertionSort(array);
    System.out.println("after sorting");
    int k=0;
	for(int j=0;j<i;j++) {
		System.out.println(array[j]);
		k=array[j];
		list.add(k);
	}
	System.out.println("LinkedList containts:");
	list.show();
	System.out.println("Enter the any value:");
	int value=utility.inputInteger();
	boolean flag=list.search(value);
	if(flag) {
		list.sortedRemove(value);
	}else
		list.sortedAdd(value);
		
	}

}
