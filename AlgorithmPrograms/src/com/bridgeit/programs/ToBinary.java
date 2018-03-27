package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class ToBinary {

	public static void main(String[] args) {
         Utility utility=new Utility();
         System.out.println("enter the Number");
         int no=utility.inputInteger();
         //int [] array2=new int[20];
        // String str=Integer.toString(no);
         Utility.decimalToBinary(no);
        
	}

}
