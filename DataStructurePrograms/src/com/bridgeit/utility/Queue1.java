package com.bridgeit.utility;

public class Queue1 {
	public class QueueNode<T> {
		QueueNode<T> next;
		T data;
	}
	
	QueueNode rear,front=null;
	
	/**
	 * @param key
	 */
	public void enQueue(Object key) {
		QueueNode temp=new QueueNode();
		temp.data=key;
		if(rear==null) {
			front=temp;
					rear=temp;
		}else {
			while(rear.next!=null) {
				rear=rear.next;
			}
			rear.next=temp;
			rear=temp;
		}	
	}
	
	
	/**
	 * 
	 */
	public void deQueue() {
		System.out.println("in deque");
		QueueNode temp=new QueueNode();
		QueueNode n=front;
		if(front==null) {
			System.out.println("queue is empty");
		}else {
			while(n.next!=null) {
				temp.data=n.data;
				n=n.next;
				System.out.println("delet "+temp.data);
			}
			System.out.println("dequeue last element "+n.data);
		}
	}
	/**
	 * 
	 */
	public  void show() {
		 int count=0;
		 QueueNode node1=front;
		 while(node1!=null) {
			 count++;
			 System.out.print(node1.data+" ");
			 node1=node1.next;
		 }
		 //System.out.println(node1.data);
		 //System.out.println("total words are:"+(count+1));
	 }

}
