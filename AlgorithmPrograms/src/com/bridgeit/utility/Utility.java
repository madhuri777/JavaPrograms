package com.bridgeit.utility;
import java.util.Arrays;
import java.util.Scanner;


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
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	/**
	 * @param string1
	 * @param string2
	 * @param l
	 * @param h
	 */
	public static void checkAnagramProgram(String s1,String s2) {
		String str=s1.replace("\\s","");
		String str2=s2.replace("\\s","");
		boolean flag=true;
		if(str.length()!=str2.length()) {
			flag=false;
		}else {
			char[] array1=str.toLowerCase().toCharArray();
			char[] array2=str2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			flag=Arrays.equals(array1, array2);
		}
		if(flag) {
			System.out.println(" Are Anagram");
		}else {
			System.out.println("are not angram");
		}
		
	}
	/**
	 * @return
	 */
	public static int primeNumberprogram(int i) {
		int count=0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==0) {
			
			System.out.println(i);
					}
		return i;
	}
		
	
	/**
	 * @param n
	 * @return
	 */
	public static int Palindrom(int n) {
        int temp=0;
        int n1=0;
        temp=n;
        int sum=0;
        while(n>0) {
        	int r=n%10;
            sum=sum*10+r;
            n=n/10;	
        }
        if(temp==sum) {
        	//System.out.println(temp);
           n1=primeNumberprogram(temp);

        }
        return n1;
	}
	
	public static<T extends Comparable<T>> void bubbleSortMethod(T[] array) {
		T temp;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j].compareTo(array[j+1])>0) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
	}
}	
    for(int k=0;k<array.length;k++) {
		System.out.println(array[k]);

    }
}
	public static<T extends Comparable<T>> void binarySearch(T[] array, T key,int l,int h) {
       if(l<=h) {
		int min=(l+h)/2;
		if(array[min].equals(key)) {
			System.out.println("true");
			System.out.println("key found at:"+(min));
			}else
        	if((array[min].compareTo(key))>0) {
        		System.out.println("true");
        		h=min-1;
        	binarySearch(array,key,l,h);
        }else{
        	System.out.println("true");
        	l=min+1;
        	binarySearch(array,key,l,h);
        }
}else {
       System.out.println("key not found");
	}
	}

public static<T extends Comparable<T>> void insertionSort(T[] array) {
	int n=array.length;
	T temp;
	for(int i=1;i<n;i++) {
		int j=i;
		while(j>0&&(array[j-1].compareTo(array[j])>0)) {
			temp=array[j];
			array[j]=array[j-1];
			array[j-1]=temp;
			j--;
		}
		
	}System.out.println("after sorting:");
	for(int l=0;l<n;l++) {
		System.out.println(array[l]);
	}
}

public static void monthlyPaymentMethod(double P, double Y,double R) {
	double r=R/(12*100);
    double n=12*Y;
    double payment=(P*r)/(1-Math.pow(1+r, (-n)));
    System.out.println(payment);
}
public static void decimalToBinary(int no) {
	int[] array=new int[20];
	int i=0,j;
	int temp=no;
	while(no>0) {
	int r=no%2;
	   array[i++]=r;
		no=no/2;
	} 
	//System.out.println(i);
	int l=i;
	System.out.print("binary number"+"=");
	for(j=i-1;j>0;j--) {
		System.out.print(array[j]);
	}
	System.out.println("");
    System.out.print(temp+"=");
	for(int k=i-1;k>0;k--) {
		if(array[k]==1) {
			int z=(int)Math.pow(2,k);
			System.out.print(""+z+"+");
		}
	}
}

 /*public static void twosPowerBinary(int[] array,int no) {
	int temp=no;
	int i=0;
	 decimalToBinary(no);
	 System.out.println("");
	    System.out.print(temp+"=");
		for(int k=i-1;k>0;k--) {
			if(array[k]==1) {
				int z=(int)Math.pow(2,k);
				System.out.print(""+z+"+");
			}
 }
} */
 public static void nibbleBinaryProgram(int no) {
	 int[] array=new int[20];
		int i=0,j;
		int temp=no;
		while(no>0) {
		int r=no%2;
		   array[i++]=r;
			no=no/2;
		//System.out.println(array[--i]);
			
		} 
		
		int l=i;
		if(l<=8) {
	     for( j=0;j<4;j++) {
	    	 int [] left=new int[4];
	    	left[j] =array[i];
	    	System.out.println(left[j]);
	     }
	     }
 }
 public static void squareRootnewton(int no) {
	 double epsilon=1e-15;
	 double t=no;
	 while(Math.abs(t-no/t)>epsilon) {
		 t=((no/t)+t)/2;
	 }
	 System.out.println(t);
 }
 public static long elapseTime(long start) {
		long now = System.currentTimeMillis();
		System.out.println(now);
		return (now - start) / 1000;
	}
 public static void mergeSort(int[] array,int p,int r) {
	 int q;
	    if(p < r)
	    {
	        q = (p + r) / 2;
	        mergeSort(array, p, q);
	        mergeSort(array, q+1, r);
	        merge(array, p, q, r);
	    }
	}
 
public static void merge(int[] array,int p,int q,int r) {
	int[] b=new int[10];  
    int i, j, k;
    k = 0;
    i = p;
    j = q + 1;
    while(i <= q && j <= r)
    {
        if(array[i] < array[j])
        {
            b[k++] = array[i++];   
        }
        else
        {
            b[k++] = array[j++];
        }
    }
  
    while(i <= q)
    {
        b[k++] = array[i++];
    }
  
    while(j <= r)
    {
        b[k++] = array[j++];
    }
  
    for(i=r; i >= p; i--)
    {
        array[i] = b[--k];  
    } 
 }
public static void findNumber(int N) {
	
}
}
