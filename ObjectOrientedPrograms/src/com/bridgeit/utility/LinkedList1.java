package com.bridgeit.utility;



public class LinkedList1<T> {
		 @SuppressWarnings("hiding")
		public class Node<T>{
			 @SuppressWarnings("rawtypes")
			Node next;
			 T data;
		 }
		 @SuppressWarnings("rawtypes")
		Node head;
		 @SuppressWarnings({ "unchecked", "hiding" })
		public <T> void add(T value) {
			 //System.out.println("yes we are addng"+"\n");
			 @SuppressWarnings("rawtypes")
			Node node=new Node();
			 node.data=value;
			 node.next=null;
			 if(head==null) {
				 head=node;
			 }else {
				 @SuppressWarnings("rawtypes")
				Node n=head;
				 while(n.next!=null) {
					 n=n.next;
				 }
				 n.next=node;
			 }
		 }
		 @SuppressWarnings("hiding")
		public <T> void show() {
			 int count=0;
			 
			 @SuppressWarnings("rawtypes")
			Node node1=head;
			 while(node1.next!=null) {
				 count++;
				 System.out.print(node1.data+"  ");
				 node1=node1.next;
			 }
			 System.out.print(node1.data);
			 //System.out.print("\t");
			// System.out.println("total words are:"+(count+1));
		 }
		 @SuppressWarnings("hiding")
		public <T> int search(T item) {
			 @SuppressWarnings("rawtypes")
			Node n2=head;
			 int count=0;
			 while(n2!=null) {
				 count++;
				 if((n2.data).equals(item) ){
					 return count;
				 }
				 n2=n2.next;
			 }
			
			 return 0;
			 
		 }
		 @SuppressWarnings({ "hiding", "unchecked" })
		public <T> void remove(T item,int flage) {
			 @SuppressWarnings("rawtypes")
			Node n=head;
			 @SuppressWarnings("rawtypes")
			Node n1=null;
			 if(flage==1) {
				 head=head.next;
			 }else {
				 for(int i=0;i<flage-2;i++) {
					 n=n.next;
				 }
				 n1=n.next;
				 n.next=n1.next;
				 System.out.println(n1.data+" removed from linked list");
			 }
		 }
		/* public static void main(String[] args)throws Exception {
			 LinkedList1 list=new LinkedList1();
			 list.add(34);
			 list.add(99);
			 list.add(2);
			 list.show();
		 }*/
		 
	   @SuppressWarnings({ "rawtypes", "hiding", "unchecked" })
	public <T extends Comparable> void sortedAdd(T number,int i) {
		  Node<Integer> newnode=new Node();
		  newnode.data=(int)number;
		  newnode.next=null;
		  Node n=head;
		  Node pre=new Node();
		  if(head==null) {
			  head.data=newnode.data;
			  newnode.next=head.next;
		  }else {
			   
			  while(n!=null&&(number).compareTo(n.data)>0) {
				  pre=n;
				  n=n.next;
				  
			  }
			  newnode.next=pre.next;
			  pre.next=newnode;
			  }
		  }
	  
	   }
	   
	   


	
	

