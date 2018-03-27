package com.bridgeit.utility;

import java.util.Scanner;

//import java.io.PrintWriter;
import java.lang.Math;

/**
 * @author bridgeit
 *
 */
public class Utility {

	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	// INPUT STRING
	/**
	 * @return
	 */
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT Integer
	/**
	 * @return
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * @return
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * @return
	 */
	public boolean inputboolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}

	/**
	 * @return
	 */
	public static String stringReplce(String username) {
		String s1 = "Hello <<UserName>>,how are you?";
		String string1 = s1.replace("<<UserName>>", username);
		return string1;
	}

	/**
	 * @return
	 */
	public static int flipCoin(int c) {
		int headcount = 0;
		int tailcount = 0;
		double perofhead = 0;
		double peroftail = 0;

		for (int i = 0; i < c; i++) {
			double flip = Math.random();
			if (flip < 0.5) {
				headcount++;
			} else {
				tailcount++;
			}

		}
		perofhead = (double) (headcount * 100) / c;
		peroftail = (double) (tailcount * 100) / c;
		System.out.println("percentage of head:" + perofhead);
		System.out.println("percentage of tail:" + peroftail);

		return 0;
	}

	public static int leapYearMethod(int year) {
		boolean flag = false;
		int digit = 0;
		while (year > 0) {
			int r = year % 10;
			digit++;
			year = year / 10;
		}
		if (digit == 4) {
			if (year % 400 == 0) {
				int n=year%400;
				flag = true;
			} else if (year % 100 == 0) {
				flag = false;
			} else if (year % 4 == 0) {
				flag = true;
			} else {
				flag = false;
			}
			if (flag) {
				System.out.println("this is leap year:");
			}

		} else {
			System.out.println("please enter 4digit year:");
		}

		return 0;
	}

	/**
	 * @param N
	 */
	public static void poweOfTwo(int N) {
		if (N >= 0 && N < 31) {
			for (int i = 0; i < N; i++) {
				int j = (int) Math.pow(2, i);
				System.out.println("2^" + i + "=" + j);

			}

		} else {
			System.out.println("OverFlow");
		}
	}

	/**
	 * @param N
	 * @return
	 */
	public static float harmonicseries(int N) {
		float sum = 0;
		for (int i = 1; i <= N; i++) {
			sum = sum + (float) 1 / i;
			System.out.print("1/" + i + "+");

		}
		return sum;
	}

	/**
	 * @param N
	 */
	public static void primeFactProgm(int N) {
		for (int i = 2; i < N; i++) {
			while (N % i == 0) {
				System.out.println(i);
				N = N / i;
			}
		}
		if (N > 1) {
			System.out.println(N);
		}

	}

	/**
	 * @param stake
	 * @param goal
	 * @param trail
	 */
	public static void gamblerGame(int stake, int goal, int trail) {
		int cash;
		// int bit=0;
		double win = 0;
		for (int i = 1; i <= trail; i++) {
			cash = stake;
			while (cash > 0 && cash < goal) {
				// bit++;
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal) {
				win++;
			}
		}
		// double perloss=(double)(loss*100)/trail;
		double perwin = (double) (win * 100) / trail;
		System.out.println("percentages of wining:" + perwin);
		// System.out.println(win+"of the "+trail);
		System.out.println("%of loss:" + (double) (trail - win) * 100 / trail);
	}

	/**
	 * @param x
	 * @param y
	 */
	public static void euclideanDistance(int x, int y) {
		double dist;
		double A = (x * x) + (y * y);
		dist = Math.sqrt(A);
		System.out.println(dist);

	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void rootsOfEqutn(int a, int b, int c) {
		System.out.println("eqution is :" + a + "x*x+" + b + "x+" + c);
		double root1, root2;
		double delta = b * b - 4 * a * c;
		root1 = (-b + (Math.sqrt(delta))) / (2 * a);
		root2 = (-b - (Math.sqrt(delta))) / (2 * a);
		System.out.println("roots of equations:" + root1 + "and" + root2);
	}

	/**
	 * @param t
	 * @param v
	 * @return
	 */
	public static double windChillProgram(double t, double v) {
		double ans = 0;
		if (t < 50 && v < 120 && v > 3) {
			ans = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

		}
		return ans;
	}

	/**
	 * @param str
	 * @param l
	 * @param h
	 */
	public static void permutationRecurtion(String str, int l, int h) {
		if (l == h) {
			System.out.println(str);
		} else {
			for (int i = l; i <= h; i++) {
				str = swapString(str, l, i);
				permutationRecurtion(str, l + 1, h);

				// str=swapString(str,l,i);
			}
		}

	}

	/**
	 * @param str
	 * @param i
	 * @param k
	 * @return
	 */
	public static String swapString(String str, int i, int k) {

		char[] s1 = str.toCharArray();
		char temp = s1[i];
		s1[i] = s1[k];
		s1[k] = temp;
		return String.valueOf(s1);
	}

	/**
	 * @param start
	 * @return
	 */
	public static double elapseTime(long start) {
		long now = System.currentTimeMillis();
		System.out.println(now);
		return (now - start) / 1000;
	}

	/**
	 * @param arr
	 * @param n
	 * @return
	 */
	public static int tripletProgram(int[] arr, int n) {
		int sum = 0, count = 0;
		int i, j, k;
		for (i = 0; i < n - 2; i++) {
			j = i + 1;
			k = j + 1;
			sum = arr[i] + arr[j] + arr[k];
			if (sum == 0) {
				System.out.println("triplets are:"+arr[i]+" "+arr[j]+" "+arr[k]);
				count++;
			}
		}
		return count;
	}

	/**
	 * @param choice
	 * @param row
	 * @param column
	 */
	public static void twoDiamentionArray(int choice, int row, int column) {
		Utility utility = new Utility();
		switch (choice) {
		case 1:
			int[][] array = new int[row][column];
			System.out.println("enter the Values:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					array[i][j] = utility.inputInteger();
				}
			}
			System.out.println("matrix of integer:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					/*
					 * PrintWriter writer = new PrintWriter(System.out); writer.write(array[i][j]);
					 * // System.out.println(); writer.flush(); writer.close();
					 */
					System.out.print(" " + array[i][j]);
				}
				System.out.println(" ");
			}
			break;
		case 2:
			double[][] doublearray = new double[row][column];
			System.out.println("enter the Values:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					doublearray[i][j] = utility.inputDouble();
					System.out.println(" ");
				}
			}
			System.out.println("matrix of double:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					/*
					 * PrintWriter writer = new PrintWriter(System.out);
					 * writer.write((String.valueOf(doublearray[i][j]))); System.out.println();
					 * writer.flush(); writer.close();
					 */
					System.out.print(" " + doublearray[i][j]);
				}
				System.out.println(" ");
			}
			break;

		case 3:
			boolean[][] booleanarray = new boolean[row][column];
			System.out.println("enter the Values:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					booleanarray[i][j] = utility.inputboolean();
				}
			}
			System.out.println("matrix of boolean");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					/*
					 * PrintWriter writer = new PrintWriter(System.out);
					 * writer.write((String.valueOf(booleanarray[i][j]))); writer.flush();
					 * writer.close();
					 */
					System.out.print(" " + booleanarray[i][j]);
				}
				System.out.println(" ");
			}
			break;
		}
	}

	public static int couponNumberProgram(int N) {
		boolean[] isCollected = new boolean[N];
		int count = 0;
		int distinct = 0;
		while (distinct < N) {
			count++;
			int no = (int) (Math.random() * N);
			if (!isCollected[no]) {
				distinct++;
				System.out.print(no+" ");
				isCollected[no] = true;
			}
		}
		System.out.println(" ");
		return count;

	}
	

	public static void gameBoard(int[][] board) {
		for(int x=0;x<3;x++){
			System.out.println("|");
			for(int y=0;y<3;y++) {
				System.out.println(board[x][y]+"|");
			}
			System.out.println("\n-------");
		}		
	}
}
