package com.bridgeit.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	// INPUT STRING
	/**
	 * @return
	 */
	public String inputString() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT Integer
	/**
	 * @return
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public static<T extends Comparable<T>> void insertionSort(T[] array) {
		int n=array.length;
		System.out.println("lenght of array is "+n);
		T temp;
		for(int i=1;i<n;i++) {
			int j=i;
			while(j>0&&(array[j-1].compareTo(array[j])>0)) {
				temp=array[j];
				array[j]=array[j-1];
				array[j-1]=temp;
				j--;
			}
			
		}/*System.out.println("after sorting:");
		for(int l=0;l<n;l++) {
			System.out.println(array[l]);
		}*/
	}
}
