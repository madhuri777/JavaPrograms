package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
     Utility utility=new Utility();
	 int[] array= {1, 2, 5, 10, 50, 100, 500,1000};
     System.out.println("Enter the amount:");
     int amount=utility.inputInteger();
     int note=0;
     for(int i=array.length-1;i>0;i--) {
    		 if(amount>=array[i]) {
    			 int n=amount/array[i];
    			 amount=amount-n*array[i];
    			 System.out.println("notes of "+array[i]+" is "+n);
    			  note=note+n;
    		 }
     }
     System.out.println("number of notes:"+note);
	}

}
