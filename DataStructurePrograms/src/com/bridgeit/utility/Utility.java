package com.bridgeit.utility;

import java.util.Arrays;
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
	public  int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	/**
	 * @param array
	 */
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
	/**
	 * @param exp
	 */
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
	/**
	 * @param year
	 * @return
	 */
	public static boolean isLeapyear(int year) {
		if(year%400==0||(year%100==0&&year%4==0)){
			return true;
		}
		return false;
	}
	/**
	 * @param month
	 * @param n
	 * @param year
	 * @return
	 */
	public static int day(int month,int n,int year) {
		int y,m,d,x;
		y=year-(14-month) / 12;
		 x= y+y/4-y/100+y/400;
		 m =(month+12*((14-month) / 12))-2;
		 d=(n+x+31*m/ 12)%7;
		 return d;
	}
	/**
	 * @param mnth
	 * @param year
	 */
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
	/**
	 * @param month
	 * @param year
	 */
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
	/**
	 * 
	 */
	public static void prime2D(int n) {
		Utility utility=new Utility();
		int[] array1=new int[168];
		System.out.println(1111);
		int count=0;
		int i,z=0;
		for(i=2;i<n;i++){
			count=0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==0) {	
			array1[z++]=i;
		}			
		}
		System.out.println("print all prime numbers");
		for(int k=0;k<168;k++) {
			System.out.print(array1[k]+" ");
		}
		//Utility.twoDarray(array1);	
		//Utility.anagram2D(array1);
		Utility.stackPrime(array1);
	}
	/**
	 * @param n
	 */
	public static void twoDarray(int[] n) {
		int[][] array=new int[10][25];
		int z=100;
		int k=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<25;j++) {
				if(n[k]<z) {
					array[i][j]=n[k++];
				}else {
					z=z+100;
					break;
				}
			}
		}
		System.out.println("prime numbers are in 2D:  ");
		for(int x=0;x<10;x++) {
			for(int y=0;y<22;y++) {
				System.out.print(" "+array[x][y]+"   ");
			}
			System.out.println(" ");
		}
		
	}
	
	/**
	 * 
	 */
	public static void bankAccount() {
		Utility utility=new Utility();
		int ppl=0;
		int ch2=0;
		QueueNo4<Integer> qu=new QueueNo4<Integer>();
		while(ch2!=4) {
			System.out.println("choose what you wants to do");
		System.out.print("1.Deposite  ");
		System.out.print("2.WithDrow  ");
		System.out.print("3.checkBalence  ");
		System.out.println("4 Exit");
		
		int ch=utility.inputInteger();
	    switch(ch) {
	    case 1:
	    	System.out.println("enter the amount that you wants to deposite:");
	    	int amt=utility.inputInteger();
	    	QueueNo4.balance1(amt);
	    	qu.enqueue(ppl);
	    	System.out.println();
	    	break;
	    case 2:
	    	System.out.println("Enter amount that you wants to Dithdraw");
	    	int amt1=utility.inputInteger();
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
	
	/**
	 * @param str
	 */
	public static void palindromChecker(String str) {
		QueuePalindrom p=new QueuePalindrom();
		int l=str.length();
		char[] array=str.toLowerCase().toCharArray();
		for(int i=0;i<l;i++) {
			p.enqueue(array[i]);	
		}
		p.show();
		char data0,data1;
	    boolean flag=false;
	    
	    while(p.size()>1) {
		data0=p.frontremove();
		data1=p.rearRemove();
		
		if(data0==data1) {
			flag=true;
			break;
		}else {
			flag=false;
		}
	} 
	if(!flag) {
		System.out.println("is not palindrom");
	}else {
		System.out.println("this is palindrom");
	}
	
	}
	/**
	 * @param month
	 * @param year
	 */
	public static void calenderStack(int month,int year) {
		Stack1 stk=new Stack1();
		Stack1 stk2=new Stack1();
		String[] mth={
				"","january","February","March","April","May","June","July","Agust","September","October","November","December"
		};
		int[] days= {
				0,31,28,31,30,31,30,31,31,30,31,30,31
		};
		if(month==2&&(isLeapyear(year)))
			days[month]=29;
		
		System.out.println("  "+mth[month]+" "+year );
		System.out.println();
		System.out.println("sun "+"Mon "+"Tue "+"Thu "+"Fri "+"sat");
		int d=day(month,1,year);
		
		for(int i=0;i<d;i++) {
			//System.out.printf("   ");
			stk.push(' ');
			//stk2.pop(' ');
		}
		for(int i=1;i<=days[month];i++) {
			//System.out.printf("%2d ",i);
			stk.push(' ');
			//stk2.pop(' ');
			//stk.push(' ');
			//stk2.pop(' ');
			stk.push('i');
			//stk2.pop('i');
			if((i+d)%7==0||i==days[month]) {
				//System.out.println(" ");
				stk.push(' ');
				//stk2.pop(' ');
				
			}
		}
		for(int i=days[month];i>=0;i--) {
		//	stk2.pop(data)
		}
	}
	
	public static void anagram2D(int[] array1) {
		Utility utility=new Utility();
		int[] ary=new int[168];
		boolean flag=false;
		int k=0;
		for(int i=0;i<=array1.length;i++) {
			for(int j=i+1;j<array1.length-2;j++) {
				int z=array1[i];
				int y=array1[j];
				flag=Utility.anagramNumber(z,y);
				if(flag==true) {
					ary[k++]=z;
					ary[k++]=y;
				}
			}
		}
		System.out.println("\n");
		System.out.println("Number which are angram and prime:");
		for(int q=0;q<array1.length;q++) {
		   System.out.print(""+ary[q]+" ");
		}
		//utility.twoDarray(ary);
		//utility.stackPrime(ary);
			}
	
	/**
	 * @param aray
	 */
	public static void stackPrime(int []  aray) {
		StackLinkedList lt=new StackLinkedList();
		int l=aray.length;
		/*for(int i=0;i<l-1;i++) {
			System.out.println("in stack:");
			lt.push(aray[i]);
		}
		System.out.println("Stack with Prime and Palindrom Number:");
			lt.display();*/	
		int[] ary=new int[168];
		boolean flag=false;
		int k=0;
		for(int i=0;i<=aray.length;i++) {
			for(int j=i+1;j<aray.length-2;j++) {
				int z=aray[i];
				int y=aray[j];
				flag=Utility.anagramNumber(z,y);
				if(flag==true) {
					lt.push(z);
					lt.push(z);
					//ary[k++]=z;
					//ary[k++]=y;
				}
			}
		}
		System.out.println("disply:");
		lt.display();
	}
	
		
	/**
	 * @param a
	 * @return
	 */
	public static boolean isPrime(int a) {
		 int c;
		   for ( c = 2 ; c <= a - 1 ; c++ )
		   { 
		      if ( a%c == 0 )
		     return false;
		   }
		   return true;
	}
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean anagramNumber(int a,int b) {
		String s1=String.valueOf(a);
		String s2=String.valueOf(b);
		String str=s1.replace(" ","");
		//System.out.println(str);
		String str2=s2.replace(" ","");
		//System.out.println(str2);
		boolean flag=false;
		if(str.length()!=str2.length()) {
			flag=false;
		}else {
			char[] array1=str.toCharArray();
			char[] array2=str2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			flag=Arrays.equals(array1, array2);
		}
		if(flag) {
			//System.out.println(" Are Anagram");
			return true;
		}else {
			//System.out.println("are not angram");
			return false;
			
		}
	}
	}
	

