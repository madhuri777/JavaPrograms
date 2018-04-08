package com.bridgeit.utility;

public class Stackprogram{
     char[] word=new char[100];
     int top=0;
     int size=0;
	public void push(char data) {
		word[top]=data;
      top++;
      size++;
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
	public void show() {
		for(int n:word) {
			System.out.println(n+" ");
		}
	}
}
