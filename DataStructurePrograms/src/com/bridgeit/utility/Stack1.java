package com.bridgeit.utility;

public class Stack1{
     char[] word=new char[15];
     int top=0;
	public void push(char data) {
		word[top]=data;
      top++;
	}
	public char pop(char data) {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		top--;
		data=word[top];
		word[top]=0;
		return data;
	}
	public boolean isEmpty() {
		return top<=0;
	}
	public char peek(char data) {
		data=word[top-1];
		return data;
	}
	public int size() {
		return top;
	}
}
