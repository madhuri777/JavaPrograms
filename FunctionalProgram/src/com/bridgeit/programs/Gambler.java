package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		Utility un=new Utility();
		System.out.println("Enter the stake");
		int stake=un.inputInteger();
		System.out.println("enter the goal");
		int goal=un.inputInteger();
		System.out.println("enter the no of trial");
		int trial=un.inputInteger();
		Utility.gamblerGame(stake, goal, trial);
		
	}

}
