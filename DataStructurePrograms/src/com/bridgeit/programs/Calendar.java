package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Calendar {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("enter month ");
		int mon=utility.inputInteger();
		System.out.println("enter the year");
		int year=utility.inputInteger();
		Utility.calender(mon, year);
	}

}
