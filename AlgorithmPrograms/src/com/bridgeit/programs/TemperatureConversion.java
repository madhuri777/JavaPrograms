package com.bridgeit.programs;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
       System.out.println("Enter the tempure:");
       Scanner sc=new Scanner(System.in);
       float temprature=sc.nextLong();
       
      System.out.println("Celsius to Fahrenheit:");   
    	  float F=(temprature * 9/5) + 32 ;
    	System.out.println(F);	
    	System.out.println("Fahrenheit to Celsius:");  
    	float C=(temprature-32) * 5/9;
    	System.out.println(C);
     sc.close();  
	}

}
