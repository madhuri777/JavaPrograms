package com.bridgeit.utility;

public class QueueNo4<T> {
     int[] queue=new int[20];
     int size;
     int front;
     int rear;
     static int  sum=0;
     public void enqueue(int data) {
    	 queue[rear]=data;
    	 rear++;
    	 size++;
     }
     public void dequeue(int data) {
    	 int value=queue[front];
    	 front++;
    	 size--;
     }
     public void show() {
    	 int i;
    	 for(i=0;i<size;i++) {
    	 }
    	 System.out.println("Totle members is queue are: "+i);
     }
     
     public static void balance1(int amount) {
    	 sum=sum+amount;
    	 System.out.println("Amount is :"+sum);
     }
     
     public static void balance2(int amount) {
    	 sum=sum-amount;
    	 System.out.println("Amount is: "+sum);
     }
     
     public static void checkBalance() {
    	 System.out.println("Available Balance is: "+sum);
     }
   
	
}
