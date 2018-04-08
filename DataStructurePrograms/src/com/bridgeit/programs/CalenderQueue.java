package com.bridgeit.programs;

import com.bridgeit.utility.QueueLinkedList;
import com.bridgeit.utility.Utility;

public class CalenderQueue {

	public static void main(String[] args) {
		
		Utility utility=new Utility();
		System.out.println("enter the month");
		int month=utility.inputInteger();
		System.out.println("Enter the year");
		int year=utility.inputInteger();
		Utility.calenderQueue(month, year);
		
		/*
		
		Queue1 queue=new Queue1();
		queue.enQueue(45);
		queue.enQueue(70);
		System.out.println("calling show method:");
		queue.show();
		System.out.println("after deque");
		queue.deQueue();
*/
	}

}
