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
	   System.out.println("i m here"+data);
	   Node newNode=new Node();
	   newNode.data=data;
	   if(top==null) {
		 newNode.next=null;
		 top=newNode;
	   }else {
	      // Node n=new Node();
	       newNode.next=top;
	       top=newNode;
	   size++;
   }
   }
   public void pop() {
	   Node temp=new Node();
	   if(top==null) {
		   System.out.println("stack is empty: ");
	   }
	   //int value=top.data;
	   temp=top;
	   System.out.println("delet item:"+temp.data);
	   top=temp.next;
	
	size--;   
   }
   
   public int size() {
	   return size;
   }
   public void display() {
	   Node temp=new Node();
	   temp=top;
	   if(top.next==null) {
		   System.out.println("stack is empty");
	   }
	   while(temp.next!=null){
		   System.out.print(" "+temp.data);
		temp=temp.next;   
	   }
	   System.out.print(" "+temp.data);
   }
	
}
