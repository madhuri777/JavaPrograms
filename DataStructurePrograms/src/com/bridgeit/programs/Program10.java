package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Program10 {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("enter the month");
		int month=utility.inputInteger();
		System.out.println("Enter the year");
		int year=utility.inputInteger();
		Utility.calenderStack(month, year);
	}

}
