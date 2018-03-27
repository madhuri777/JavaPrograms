package com.bridgeit.programs;
//import java.math.*;

import com.bridgeit.utility.Utility;
public class MonthlyPayment {

	public static void main(String[] args) {
		System.out.println("Enter the values for p Y R:");
		double P=Double.parseDouble(args[0]);
	     double Y=Double.parseDouble(args[1]);
	     double R=Double.parseDouble(args[2]);
	     Utility.monthlyPaymentMethod(P,Y,R);
	
	}

}
