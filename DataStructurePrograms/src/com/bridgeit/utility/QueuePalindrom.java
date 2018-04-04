package com.bridgeit.utility;

public class QueuePalindrom {
	
	char[] queue=new char[20];
    static int size=0;
    int front=0;
    int rear=0;
    
    public void enqueue(char data) {
    	
   	 queue[rear]=data;
   	 System.out.println(queue[rear]);
   	  rear++;
   	size++;
   	   System.out.println("size is "+size+" rear is "+rear);
   	
    }
    public char frontremove() {
    	System.out.println(size+"in front");
    	char data;
    	data=queue[front];
    	front++;
    	//size--;
    	return data;
    }
    public char rearRemove() {
    	size--;
    	rear--;
    	System.out.println(size+"in rear");
    	char data2;
    	data2=queue[rear];
      	
    	return data2;
    }
    
    
    public void show() {
   	 int i;
   	 for(i=0;i<=rear-1;i++) {
 
   	 System.out.print(i+" "+queue[i]+"  ");
    }
    }
    public int size() {
    //	System.out.println(size);
    	return size;
    }
}
