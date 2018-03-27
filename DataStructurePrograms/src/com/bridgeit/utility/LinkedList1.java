package com.bridgeit.utility;

public class LinkedList1<T> {
	 public class Node<T>{
		 Node next;
		 T data;
	 }
	 Node head;
	 public <T> void add(T value) {
		 Node node=new Node();
		 node.data=value;
		 node.next=null;
		 if(head==null) {
			 head=node;
		 }else {
			 Node n=head;
			 while(n.next!=null) {
				 n=n.next;
			 }
			 n.next=node;
		 }
	 }
	 public <T> void show() {
		 int count=0;
		 Node node1=head;
		 while(node1.next!=null) {
			 count++;
			 System.out.println(node1.data);
			 node1=node1.next;
		 }
		 System.out.println(node1.data);
		 System.out.println("total words are:"+(count+1));
	 }
	 public <T> boolean search(T item) {
		 Node n2=head;
		// int count=0;
		 while(n2!=null) {
			// count++;
			 if((n2.data).equals(item) ){
				 return true;
			 }
			 n2=n2.next;
		 }
		// add(item);
		 return false;
		 
	 }
	 public <T> void remove(T item) {
		 Node n=head;
		 Node n1=null;
		 //n1.data=item;
		 while(n!=null) {
			 if(n.data==item) {
				 n1=n.next;
				 n.next=n1.next;
			 }
			 n=n.next;
		 }
		 System.out.println(n1.data+"somethinf");
		 
	 }
	/* public static void main(String[] args)throws Exception {
		 LinkedList1 list=new LinkedList1();
		 list.add(34);
		 list.add(99);
		 list.add(2);
		 list.show();
	 }*/
   public <T> void sortedAdd(T number) {
	  
	   
   }
   public <T> void sortedRemove(T value) {
	   
   }

}
