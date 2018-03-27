package com.bridgeit.programs;


import com.bridgeit.utility.Utility;

public class ReplaceStringTemplate {

	public static void main(String[] args) {
		Utility un=new Utility();
		System.out.println("Enter the user name");
		String username=un.inputString();
		if(username.length()<3) {
			System.out.println("userName containe at least 3 character");
		}else {
		System.out.println(Utility.stringReplce(username));
		}
	
	}

}
