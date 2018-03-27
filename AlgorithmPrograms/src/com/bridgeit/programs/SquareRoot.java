package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class SquareRoot {

	public static void main(String[] args) {
       Utility utility=new Utility();
       System.out.println("enter the value");
       int no=utility.inputInteger();
       Utility.squareRootnewton(no);
       
	}

}
