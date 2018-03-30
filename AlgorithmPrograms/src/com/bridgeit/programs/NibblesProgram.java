package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class NibblesProgram {

	public static void main(String[] args)throws Exception {
      Utility utility=new Utility();
      //System.out.println("enter the value");
      System.out.println("ENter the any number:");
      int n0=utility.inputInteger();
      String str=Integer.toBinaryString(n0);
      System.out.println("This is:"+str);
     Utility.nibbleBinaryProgram(str);
    //  Utility.swapping();
	}

}
