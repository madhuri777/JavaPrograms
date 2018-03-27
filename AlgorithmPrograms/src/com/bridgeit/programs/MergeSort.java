package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		Utility utility=new Utility();
		//Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the no of element");
		   int no=utility.inputInteger();
		   int p=0;
		   int r=no-1;
		   int[] array=new int[no];
		   System.out.println("enter the values in array:");
		   for(int i=0;i<no;i++) {
			   array[i]=utility.inputInteger();
		   }
		   Utility.mergeSort(array,p,r);
		   System.out.println("Sorted array:");
		   for(int i=0;i<no;i++) {
			   System.out.print(array[i]+" ");
			   ;
		   }
		}

	}


