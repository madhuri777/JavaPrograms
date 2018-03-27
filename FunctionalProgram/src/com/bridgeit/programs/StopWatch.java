package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class StopWatch {

	public long watch1() {
				return (System.currentTimeMillis());
	}
	public static void main(String[] args) {
		int sum=0;
		Utility un=new Utility();
		StopWatch st=new StopWatch();
		long start1=st.watch1();
		System.out.println("starting time:"+start1);
		System.out.println("enter any one number");
		int N=un.inputInteger();
		for(int i=0;i<N;i++) {
		 sum=sum+i;	
		 System.out.println(sum);
		}
		//System.out.println(sum);
		System.out.println(Utility.elapseTime( start1));
	}

}
