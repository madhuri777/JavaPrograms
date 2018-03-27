package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class TicTacToe {

	public static void main(String[] args) {
         Utility utility=new Utility();
		int[][] board=new int[3][3];
		int row;
 	   int col;
		Utility.gameBoard(board);
	   while(true) {
		   System.out.println("TicTacToe");
		   System.out.println("Choose option who will take first tum:1.For user and 2.for computer");
	       int n=utility.inputInteger();
	       while(n==1) {
	    	   System.out.println("user will take first turm");
	    	   System.out.println("enter the row and colmn");
	    	   row=utility.inputInteger();
	    	   col=utility.inputInteger();
	    	  Utility.gameBoard(board);
	       }
	   while(n==2) {
		   System.out.println("computer will take turm");
		   row=(int)(Math.random()%2);
		   col=(int)(Math.random()%2);
	   }
	   board[row][col]='X';
	  Utility.gameBoard[board];
	   if(gameWon('X',board)) {
		  System.out.println("player one won");
	   }else if(gameDrow(board)) {
		   System.out.println("No one won");
	   }
	   System.out.println("Enter a colm and  and");
	   col=utility.inputInteger();
	   row=utility.inputInteger();
	   board[row][col]='0';
	   gamBoard[board];
	   if(gameWon('0',board)) {
			  System.out.println("player second won");
		   }else if(gameDrow(board)) {
			   System.out.println("No one won");
		   }
	   
	   
	}

}
}
