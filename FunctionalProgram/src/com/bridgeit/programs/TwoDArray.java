package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class TwoDArray {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("enter the no of rows and colunm");
		int row=utility.inputInteger();
		int column=utility.inputInteger();
		System.out.println("Following are the options:");
		System.out.println("1.integer");
		System.out.println("2.double");
		System.out.println("3.boolean");
		System.out.println("Enter the choice");
        int choice=utility.inputInteger();	
        Utility.twoDiamentionArray(choice,row,column);
	}

}
