package com.bridgeit.programs;

public class DayOfWeek {

	public static void main(String[] args) {
     System.out.println("Enter the date ");
     int month=Integer.parseInt(args[0]);
     int day=Integer.parseInt(args[1]);
     int year=Integer.parseInt(args[2]);
      int y,x,m,d;      
             y=year-(14-month) / 12;
    		 x= y+y/4-y/100+y/400;
    		 m =(month+12*((14-month) / 12))-2;
    		 d=(day+x+31*m/ 12)%7;
    		 System.out.println(d);
    System.out.println("month is"+m+"day is:"+d+"year is"+x);
    switch(d){
    case 0:
    	System.out.println("sunday");
    	break;
    case 1:
    	System.out.println("Monday");
    	break;
    case 2:
    	System.out.println("Tuesday");
    	break;
    case 3:
    	System.out.println("Wednesday");
    	break;
    case 4:
    	System.out.println("Thursday");
    	break;
    case 5:
    	System.out.println("Friday");
    	break;
    case 6:
    	System.out.println("Saturday");
    	break;
    }
	}

}
