package com.bridgeit.utility;

public class QueuePalindrom {
	char[] queue=new char[20];
    int size;
    int front=0;
    int rear=0;
    public void enqueue(char data) {
    	System.out.print("inserted:  ");
   	 queue[rear]=data;
   	 System.out.println(queue[rear]);
   	  rear++;
   	   size++;
    }
    
    public void frontDequeu(int f,int l) {
    	int front =f;
    	int rear=l;
    	char value1=queue[front];
    	front++;
    	char value2=queue[rear];
    	if(value1==value2&&front>rear) {
    		front++;
    		rear--;
    	}else {
    		System.out.println("String is not palindrom");
    	}
    }
    public char frontremove() {
    	//System.out.println(size);
    	char data;
    	data=queue[front];
    	front++;
    	size--;
    	return data;
    }
    public char rearRemove() {
    	rear=size;
    	char data2;
    	data2=queue[rear];
    	rear--;
    	size--;
    	return data2;
    }
    
    
    public void show() {
   	 int i;
   	 for(i=front;i<=rear;i++) {
 
   	 System.out.print(queue[i]+"  ");
    }
    }
    public int size() {
    	System.out.println(size);
    	return size;
    }
}
