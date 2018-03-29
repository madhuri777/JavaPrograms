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
    public void frontDequeu() {
    	char value1=queue[front];
    	front++;
    	char value2=queue[rear];
    	if(value1==value2&&front>rear) {
    		front++;
    		rear--;
    	}else {
    		
    	}
    }
    public void dequeue(int data) {
   	 int value=queue[front];
   	 front++;
   	 size--;
   	 System.out.println(value);
    }
    public void show() {
   	 int i;
   	 for(i=front;i<=rear;i++) {
 
   	 System.out.print(queue[i]+"  ");
    }
    }
}
