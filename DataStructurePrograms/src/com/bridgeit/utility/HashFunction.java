package com.bridgeit.utility;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgeit.utility.LinkedList1.Node;

public class HashFunction {
	LinkedList1 l0=new LinkedList1();
	LinkedList1 l1=new LinkedList1();
	LinkedList1 l2=new LinkedList1();
	LinkedList1 l3=new LinkedList1();
	LinkedList1 l4=new LinkedList1();
	LinkedList1 l5=new LinkedList1();
	LinkedList1 l6=new LinkedList1();
	LinkedList1 l7=new LinkedList1();
	LinkedList1 l8=new LinkedList1();
	LinkedList1 l9=new LinkedList1();
	LinkedList1 l10=new LinkedList1();
	
     public void hashMethod(int[] array) {
         int rem=0;
    	 int[] array2=new int[11];
    	 int l=array.length;
    	 for(int i=0;i<l;i++) {
    		  rem=array[i]%11;
    		 if(array2[rem]==0) {
    			 array2[rem]=array[i];	
    		 }else {
    			 if(rem==0) {
    				 l0.add(array[i]);
    		 }if(rem==1) {
    			 l1.add(array[i]);
    		 }if(rem==2) {
    			 l2.add(array[i]);
    		 }if(rem==3) {
    			 l3.add(array[i]);
    		 }if(rem==4) {
    			 l4.add(array[i]);
    		 }if(rem==5) {
    			 l5.add(array[i]);
    		 }if(rem==6) {
    			 l6.add(array[i]);
    		 }if(rem==7) {
    			 l7.add(array[i]);
    		 }if(rem==8) {
    			 l8.add(array[i]);
    		 }if(rem==9) {
    			 l9.add(array[i]);
    		 }
    		 }
    	 }
    	 System.out.println("sorted:");
    	 System.out.println("sorted array:");
    	 for(int i=0;i<11;i++) {
    		 System.out.print(" "+array2[i]);
    	 }
    	 l0.show();
    
     }
}