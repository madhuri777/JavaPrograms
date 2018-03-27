package com.bridgeit.utility;

public class LinkedList1<T> {
   Node node=new Node();
   Node head;
   public <T>void add(T value) {
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
   public <T>void show() {
	   //Node node=new Node();//
	   node=head;
	   while(node.next!=null) {
		   System.out.println(node.data);
            node=node.next;
	   }
	  System.out.println(node.data);
   }
   public <T>void searchMethod(T search) {
	   Node n1=new Node();
	   n1=head;
	   while(n1.next!=null) {
		   if(n1.data==search) {
			   remove();
		   }
		   n1=n1.next;
	   }
   }
   public <T> void remove() {
	   Node n=head;
	   Node n1=null;
	   
	   n.data=head;
   }

}
