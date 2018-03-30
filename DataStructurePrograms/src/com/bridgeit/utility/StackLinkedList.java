package com.bridgeit.utility;

import org.omg.Messaging.SyncScopeHelper;

public class StackLinkedList {
	Node top=null;
	int size=0;
	public class Node{
		Node next;
		int data;
	}
	
  LinkedList1<Integer> list=new LinkedList1<Integer>();
   public void push(int data) {
	   Node newNode=new Node();
	   newNode.data=data;
	   if(top==null) {
		 newNode.next=null;
		 top=newNode;
	   }
	   top.next=newNode;
	   newNode=top;
	   size++;
	  
   }
   public void pop(int data) {
	   if(top==null) {
		   System.out.println("stack is empty: ");
	   }
	   int value=top.data;
	   top=top.next;
	 System.out.println("delet item:"+value);
	size--;   
   }
   
   public int size() {
	   return size;
   }
   public void display() {
	   Node temp=new Node();
	   if(top.next==null) {
		   System.out.println("stack is empty");
	   }
	   while(temp.next!=null){
		   System.out.println(" "+temp.data);
		temp=temp.next;   
	   }
	   System.out.println(" "+temp.data);
   }
	
}
