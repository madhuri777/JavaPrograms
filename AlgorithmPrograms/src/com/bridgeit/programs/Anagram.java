package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choose:1.String 2.Integer");
		int ch=utility.inputInteger();
		switch(ch) {
		case 1:
		     System.out.println("Enter the two String:");
		     //String s1=utility.inputString();
		     String s1=sc.nextLine();
		     //System.out.println("");
		     //String s2=utility.inputString();
		     String s2=sc.nextLine();
		     Utility.checkAnagramProgram(s1,s2);
		     break;
		case 2:
			System.out.println("Enter the two Numbers:");
			int n1=utility.inputInteger();
			String no1=Integer.toString(n1);
			int n2=utility.inputInteger();
			String no2=Integer.toString(n2);
			Utility.checkAnagramProgram(no1,no2);
			break;
		}
		sc.close();
	}

}
