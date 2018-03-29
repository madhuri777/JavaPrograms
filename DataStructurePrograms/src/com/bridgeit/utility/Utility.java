package com.bridgeit.utility;

import java.util.Scanner;

public class Utility {
	static Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	// INPUT STRING
	/**
	 * @return
	 */
	public String inputString() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT Integer
	/**
	 * @return
	 */
	public static int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public static<T extends Comparable<T>> void insertionSort(T[] array) {
		int n=array.length;
		System.out.println("lenght of array is "+n);
		T temp;
		for(int i=1;i<n;i++) {
			int j=i;
			while(j>0&&(array[j-1].compareTo(array[j])>0)) {
				temp=array[j];
				array[j]=array[j-1];
				array[j-1]=temp;
				j--;
			}
			
		}/*System.out.println("after sorting:");
		for(int l=0;l<n;l++) {
			System.out.println(array[l]);
		}*/
	}
	public static void checkParantheses(String exp) {
		Stack1 st=new Stack1();
		char data=' ';
		for(int j=0;j<exp.length();j++) {
			if(exp.charAt(j)=='('||exp.charAt(j)==')') {
				 data=exp.charAt(j);
				 System.out.println("push "+data);
				st.push(data);
			}
		}
		int opn=0,cls=0;
		System.out.println("pop all elements:");
		while(!(st.isEmpty())) {
			char data1=st.pop(data);
			if(data1=='(') {
				System.out.println("pop "+data1);
			 opn++;
			}else {
				System.out.println("pop "+data1);
				cls++;
		}
			}
		if(opn==cls) {
			System.out.println("Parantheses are balanced");
		}else {
			System.out.println("parantheses are not balanced");
		}
		
	}
	public static boolean isLeapyear(int year) {
		if(year%400==0||(year%100==0&&year%4==0)){
			return true;
		}
		return false;
	}
	public static int day(int month,int n,int year) {
		int y,m,d,x;
		y=year-(14-month) / 12;
		 x= y+y/4-y/100+y/400;
		 m =(month+12*((14-month) / 12))-2;
		 d=(n+x+31*m/ 12)%7;
		 return d;
	}
	public static void calender(int mnth,int year) {
		String[] month={
				"","january","February","March","April","May","June","July","Agust","September","October","November","December"
		};
		int[] days= {
				0,31,28,31,30,31,30,31,31,30,31,30,31
		};
		if(mnth==2&&(isLeapyear(year)))
			days[mnth]=29;
		
		System.out.println("  "+month[mnth]+" "+year );
		System.out.println();
		System.out.println("sun "+"Mon "+"Tue "+"Thu "+"Fri "+"sat");
		int d=day(mnth,1,year);
		
		for(int i=0;i<d;i++) {
			System.out.printf("   ");
		}
		for(int i=1;i<=days[mnth];i++) {
			System.out.printf("%2d ",i);
			if((i+d)%7==0||i==days[mnth]) {
				System.out.println(" ");
			}
		}
		
	}
	public static void calenderQueue(int month,int year) {
		Queue1 week=new Queue1();
		String[] mnth={
				"","january","February","March","April","May","June","July","Agust","September","October","November","December"
		};
		int[] days= {
				0,31,28,31,30,31,30,31,31,30,31,30,31
		};
		if(month==2&&(isLeapyear(year)))
			days[month]=29;
		
		System.out.println("  "+mnth[month]+" "+year );
		System.out.println();
		System.out.println("sun\tMon\tTue\tWed\tThu\tFri\tsat");
		int d=day(month,1,year);
		
		for(int i=0;i<d;i++) {
			week.enQueue("\t");
		}
		for(int i=1;i<=days[month];i++) {
			week.enQueue(i+"\t");
			if((i+d)%7==0||i==days[month]) {
				week.enQueue("\n");
			}
		}
		week.show();
	}
	public static void prime2D() {
		//int[][] array=new int[1][100];
		System.out.println(1111);
		int count=0;
		int i;
		for(i=2;i<1000;i++){
			count=0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==0) {	
			System.out.println(i);
			//array[]
		}			
		}
	}
	
	public static void bankAccount() {
		int ppl=0;
		int ch2=0;
		QueueNo4<Integer> qu=new QueueNo4<Integer>();
		while(ch2!=4) {
			System.out.println("choose what you wants to do");
		System.out.print("1.Deposite  ");
		System.out.print("2.WithDrow  ");
		System.out.print("3.checkBalence  ");
		System.out.println("4 Exit");
		
		int ch=inputInteger();
	    switch(ch) {
	    case 1:
	    	System.out.println("enter the amount that you wants to deposite:");
	    	int amt=inputInteger();
	    	QueueNo4.balance1(amt);
	    	qu.enqueue(ppl);
	    	System.out.println();
	    	break;
	    case 2:
	    	System.out.println("Enter amount that you wants to Dithdraw");
	    	int amt1=inputInteger();
	    	QueueNo4.balance2(amt1);
	    	qu.dequeue(ppl);
	    	System.out.println();
	    	break;
	    case 3:
	    	System.out.println("checkbalance :");
	    	QueueNo4.checkBalance();
	    	System.out.println();

	    	break;
	    case 4:
	    	System.exit(0);
	    }
	    qu.show();
    	System.out.println();
    	System.out.println();
	}
	       	
	}
	
	public static void palindromChecker(String str) {
		QueuePalindrom p=new QueuePalindrom();
		int l=str.length();
		char[] array=str.toLowerCase().toCharArray();
		for(int i=0;i<l;i++) {
			p.enqueue(array[i]);
		}
		System.out.println("folllowing is queue:");
		p.show();
	}
}
