package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class ElapsedTime {

	public long watch1() {
		return (System.currentTimeMillis());
}
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("enter the no of elements");
		int N=utility.inputInteger();
		
		   System.out.println("sorting for:1.integer 2.string");
	       int ch1=utility.inputInteger();
	       System.out.println("Insert name of sorting");
	       String name=utility.inputString();
	       
	       switch(ch1) {
	       case 1:
	    	   System.out.println("elements");
	    	   Integer[] array=new Integer[N];
	    	   for(int i=0;i<N;i++)
	   			array[i]=utility.inputInteger();
	    	  
	    	   
/*-----------For Insertion Sort----------*/	
	    	   
	    	   if(name.equals("insertion")) {
	    		   ElapsedTime st=new ElapsedTime();
	    			long start1=st.watch1();
	    			System.out.println("starting time:"+start1);
	    		   Utility.insertionSort(array);
	    		   System.out.println(Utility.elapseTime( start1));
	    	   }
/*----------For BubbleSort--------------*/
	    		   else if(name.equals("bubblesort")) {
	    			   ElapsedTime st=new ElapsedTime();
		    			long start1=st.watch1();
		    			System.out.println("starting time:"+start1);
		    		   Utility.bubbleSortMethod(array);
		    		   System.out.println(Utility.elapseTime( start1));
	    		   }
	    	   break;
	       case 2:
	    	   System.out.println("elements");
	    	   String[] array2=new String[N];
			for(int i=0;i<N;i++)
				array2[i]=utility.inputString();
			
/*-----------For Insertion Sort----------*/	
	    	   
	    	   if(name.equals("insertion")) {
	    		   ElapsedTime st=new ElapsedTime();
	    			long start1=st.watch1();
	    			System.out.println("starting time:"+start1);
	    		   Utility.insertionSort(array2);
	    		   System.out.println(Utility.elapseTime( start1));
	    	   }
/*----------For BubbleSort--------------*/
	    		   else if(name.equals("BubbleSort")) {
	    			   ElapsedTime st=new ElapsedTime();
		    			long start1=st.watch1();
		    			System.out.println("starting time:"+start1);
		    		   Utility.bubbleSortMethod(array2);
		    		   System.out.println(Utility.elapseTime( start1));
	    		   }
			
	    	   }
	    	   
		
	       }
	}	
		
		




