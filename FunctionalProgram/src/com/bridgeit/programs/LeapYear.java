package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the year");
	    int year=utility.inputInteger();
	    Utility.leapYearMethod(year);
	    }

}
