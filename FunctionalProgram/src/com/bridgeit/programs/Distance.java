package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Distance {

	public static void main(String[] args)throws Exception {
	   int X=Integer.parseInt(args[0]);
	   int Y=Integer.parseInt(args[1]);
	  System.out.println(args.length);
	   Utility.euclideanDistance(X, Y);
	}

}
