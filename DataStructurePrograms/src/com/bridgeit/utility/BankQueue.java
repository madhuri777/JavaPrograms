package com.bridgeit.utility;

public class BankQueue<T> {
     int[] queue=new int[20];
     int size=0;
     int front;
     int rear;
     static int  sum=1000;
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
     
     public static void deposit(int amount) {
    	 sum=sum+amount;
    	 System.out.println("Amount is :"+sum);
     }
     
     public static void withdraw(int amount) {
    	 sum=sum-amount;
    	 if(sum<100) {
    		 System.out.println("u can't withdraw money:");
    	 }else {
    	 System.out.println("Amount is: "+sum);
     }
     }
     
     public static void checkBalance() {
    	 System.out.println("Available Balance is: "+sum);
     }
   public  int size() {
	   System.out.println("Size if queue is: "+size);
	   return size;
   }
	
}
