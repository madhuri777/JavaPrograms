package com.bridgeit.utility;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

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
		Stackprogram st=new Stackprogram();
		char data=' ';
		for(int j=0;j<exp.length();j++) {
			if(exp.charAt(j)=='('||exp.charAt(j)==')') {
				 data=exp.charAt(j);
				// System.out.println("push "+data);
				st.push(data);
			}
		}
		int opn=0,cls=0;
		while(!(st.isEmpty())) {
			char data1=st.pop(data);
			if(data1=='(') {
			 opn++;
			}else {
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
		QueueLinkedList week=new QueueLinkedList();
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
		//Utility utility=new Utility();
		int[] array1=new int[300];
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
		System.out.println();
		System.out.println("print all prime numbers");
		for(int k=0;k<168;k++) {
			System.out.print(array1[k]+" ");
		}
		Utility.twoDarray(array1);	
		//Utility.anagram2D(array1);
		
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
				if(n[k]<(z*(i+1))) {
					array[i][j]=n[k++];
				}else {
					//z=z+100;
					break;
				}
			}
		}
		System.out.println();
		System.out.println("prime numbers are in 2D:  ");
		for(int x=0;x<10;x++) {
			for(int y=0;y<25;y++) {
				if(array[x][y]>0) {
				System.out.print(" "+array[x][y]+"   ");
				}
			}
			System.out.println(" ");
		}
		
	}
	
	/**
	 * 
	 */
	public static void bankAccount() {
		Utility utility=new Utility();
		BankQueue<Integer> qu=new BankQueue<Integer>();
		int size=0;
		System.out.println("Add number of people in queue: ");
		int no=utility.inputInteger();
		for(int i=0;i<no;i++) {
			qu.enqueue(i);
		}
		 size=qu.size();
       // int ch2=0;
		 for(int i=0;i<size;i++){
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
	    	BankQueue.deposit(amt);
	    	qu.dequeue(size);
	    	System.out.println();
	    	break;
	    case 2:
	    	System.out.println("Enter amount that you wants to Dithdraw");
	    	int amt1=utility.inputInteger();
	    	BankQueue.withdraw(amt1);
	    	qu.dequeue(size);
	    	System.out.println();
	    	break;
	    case 3:
	    	System.out.println("checkbalance :");
	    	BankQueue.checkBalance();
	    	qu.dequeue(size);
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
		System.out.println("lenght of string is "+l);
		char[] array=str.toLowerCase().toCharArray();
		int l1=array.length;
		System.out.println("array lenght is: "+l1);
		for(int i=0;i<l1;i++) {
			p.enqueue(array[i]);	
		}
		
		char data0;
		char data1;
		boolean flag=false;
		while(p.size()>1) {
		data0=p.frontremove();
		//System.out.println(size);
		data1=p.rearRemove();
		//System.out.println(size);
		
		if(data0!=data1) {
			//System.out.println("Are not palindrom");
			flag=false;
			break;
		}else {
			flag=true;
		}
	
	}if(flag==true) {
		System.out.println("Palindrom: ");
	}else {
		System.out.println("Not palindrom: ");
	}
		
	}
	/**
	 * @param month
	 * @param year
	 */
	public static void calenderStack(int month,int year) {
		StackLinkedList<Integer> stk=new StackLinkedList<Integer>();
		StackLinkedList<Integer> stk1=new StackLinkedList<Integer>();
		//Stack1 stk2=new Stack1();
		String[] months={
				"","january","February","March","April","May","June","July","Agust","September","October","November","December"
		};
		int[] days= {
				0,31,28,31,30,31,30,31,31,30,31,30,31
		};
		if(month==2&&(isLeapyear(year)))
			days[month]=29;
		
		System.out.println("  "+months[month]+" "+year );
		System.out.println();
		System.out.println("sun "+"Mon "+"Tue "+"Thu "+"Fri "+"sat");
		int d=day(month,1,year);
		
		for(int i=0;i<d;i++) {
			//System.out.printf("   ");
			stk.push(" ");
		}
		for(int i=1;i<=days[month];i++) {
			//System.out.printf("%2d ",i);
			stk.push(i);
			stk.pop();
			if((i+d)%7==0||i==days[month]) {
				//System.out.println(" ");
				stk.push("\n");
				stk.pop();
			}
		}
	
		
		stk.size();
		stk.pop();
		stk.size();
		stk.display();
	}
	
	/**
	 * @param array1
	 */
	public static void anagram2D(int[] array1) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		int[] ary=new int[168];
		boolean flag=false;
		int k=0;
		int z=0;
		int y=0;
		for(int i=0;i<=array1.length;i++) {
			for(int j=i+1;j<array1.length-2;j++) {
			        z=array1[i];
				    y=array1[j];
				flag=Utility.anagramNumber(z,y);
				if(flag==true) {
					ary[k++]=z;
					ary[k++]=y;
				}
			}
		}
		System.out.println(ary.length);
		for(int i=0;i<ary.length;i++) {
			set.add(ary[i]);
		}
		Iterator<Integer> it=set.iterator();
		System.out.println("Prime ANd anagram:");
		int i=0;
		while(it.hasNext()) {
			ary[i++]=(int)it.next();
		}
		Utility.queuePrime(ary);
			}
	
	/**
	 * @param aray
	 */
	public static void stackPrime(int []  aray) {
		StackLinkedList<?> lt=new StackLinkedList();
		for(int i=0;i<=aray.length-1;i++) {
				lt.push(aray[i]);
			}
		System.out.println();
		System.out.print("Display stack::  ");
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
		String str2=s2.replace(" ","");
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
			return true;
		}else {
			return false;
			
		}
	}
	/**
	 * @param array
	 */
	public static void queuePrime(int[] array) {
		QueueLinkedList queue=new QueueLinkedList();
		for(int i=0;i<=array.length-1;i++) {
			queue.enQueue(array[i]);	
		}
		System.out.println();
		System.out.print("Display queue::  ");
		queue.show();
		
	}
	
	/**
	 * @param n
	 */
	public static void binaryTree (int n) {
		int k=0,z=0,x;
		int Ans=0;
		k=factorial(2*n);
	
		z=factorial((n+1));
		x=factorial(n);
		 Ans=k/(z*x);
		 System.out.println(" "+Ans);
		
	}
	public static int factorial(int i) {
		int fact=1;
		for(int j=i;j>0;j--) {
			fact=fact*j;
		}
		return fact;
	}
	
	
	/**
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static void HashingFunction()throws Exception {
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
	    File file = new File("HashFunction.txt");
	    sc = new Scanner(file);

	   LinkedList<Integer> list = new LinkedList<>();
	     while (sc.hasNext()) {
		     Integer no = sc.nextInt();
		     list.add(no);
	   }
	     
	System.out.println("size is"+list.size());

	//list.sort(null);
	@SuppressWarnings("rawtypes")
	HashMap<Integer, LinkedList> hashmap = new HashMap<>();
	int rem = 0;
	int data = 0;
	for (int i = 0; i < list.size(); i++) {
		data = list.get(i);

		rem = data % 11;
		if (hashmap.containsKey(rem)) {
			hashmap.get(rem).add(data);
		} else {
			hashmap.put(rem, new LinkedList<>());

			hashmap.get(rem).add(data);
		}

	}
	System.out.println("size is 2:"+list.size());
	try {

		Iterator<?> iterator = (Iterator<?>) hashmap.keySet().iterator();
	
		while (iterator.hasNext()) {
			int key = (int)iterator.next();
			System.out.print(key);
			System.out.println(hashmap.get(key));

		}
		
		
		System.out.println("size is 3:"+list.size());
		System.out.println("enter target to search");
		Integer target1 = utility.inputInteger();
		
		if (list.contains(target1)) {
			System.out.println("element is found and delete it");
			//System.out.println(list.remove(target1));
			hashmap.get(rem).remove(target1);
		} else {
			System.out.println("element is not found and add it");
			System.out.println(list.add(target1));
			rem=target1%11;
			if(hashmap.containsKey(rem)) {
				hashmap.get(rem).add(target1);
			}else {
				hashmap.put(rem,new LinkedList());
				hashmap.get(rem).add(target1);
			}

		}
		Iterator<?> iterator1 = hashmap.keySet().iterator();
		
		while (iterator1.hasNext()) {
			int key = (int)iterator1.next();
			System.out.print(key);
			System.out.println(hashmap.get(key));

		}

	} catch (Exception e) {
		System.out.println("exception");
	}
}
}

	

