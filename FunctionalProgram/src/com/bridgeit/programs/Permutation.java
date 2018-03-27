package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Permutation {

	public static void main(String[] args) {
		Utility un=new Utility();
		String str=un.inputString();
		int l=str.length();
		
		Utility.permutationRecurtion(str,0,l-1);
		
	}

}
