package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class BinaryTree {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the number of Nodes for binary tree");
		int n=utility.inputInteger();
		
		for(int i=1;i<=n;i++) {
		System.out.println("Number of tree for "+i+" nodes:");
		Utility.binaryTree(i);
		
		}
	}

}
