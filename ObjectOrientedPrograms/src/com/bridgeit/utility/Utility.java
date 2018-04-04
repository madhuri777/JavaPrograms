package com.bridgeit.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Utility {

	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	// INPUT STRING
	/**
	 * @return
	 */
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	public String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	// INPUT Integer
	/**
	 * @return
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * @return
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * @return
	 */
	public boolean inputboolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}

	@SuppressWarnings("unchecked")
	public static void dataManagementWrite() throws Exception {
		Utility utility=new Utility();
	    
		System.out.print("Enter rice name: ");
		String name1=utility.inputString();
		System.out.print("price of rice per kg: ");
		int price1=utility.inputInteger();
		System.out.print("weight of rice: ");
		int weight1=utility.inputInteger();
		System.out.println("TOtal Price of "+weight1+" kg rice is: ");
		float total1=(weight1*price1);
		System.out.println(total1);
		
		System.out.println();
		System.out.print("Enter pulses name: ");
		String name2=utility.inputString();
		System.out.print("price of pulses: ");
		int price2=utility.inputInteger();
		System.out.print("weight of pulses: ");
		int weight2=utility.inputInteger();
		System.out.println("TOtal Price of "+weight2+" kg pulses is: ");
		float total2=(weight2*price2);
		System.out.println(total2);
		
		System.out.println();
		System.out.print("Enter the wheats: ");
		String name3=utility.inputString();
		System.out.print("price of wheats: ");
		int price3=utility.inputInteger();
		System.out.print("Weight of wheats: ");
		int weight3=utility.inputInteger();
		System.out.println("TOtal Price of "+weight3+" kg rice is: ");
		float total3=(weight3*price3);
		System.out.println(total3);
		
		JSONObject obj=new JSONObject();
		obj.put("name",name1);
		obj.put("price", price1);
		obj.put("weight", weight1);
		obj.put("Total", total1);
		
		JSONObject obj1=new JSONObject();
		obj1.put("name", name2);
		obj1.put("price",price2);
		obj1.put("weight",weight2);
		obj1.put("Total", total2);
		
		JSONObject obj2=new JSONObject();
		obj2.put("name",name3);
		obj2.put("price",price3);
		obj2.put("weight",weight3);
		obj2.put("Total", total3);
		
		JSONObject obj3=new JSONObject();
		obj3.put("Rice",obj);
		obj3.put("pulses",obj1);
		obj3.put("wheats",obj2);
		try(FileWriter file=new FileWriter("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/JsonWrite.json")){
			file.write(obj3.toJSONString());
			file.flush();
			file.close();
		}catch(FileNotFoundException e) {
			System.out.println();
		}
	}
	public static boolean nameValidation(String name) {
		return Pattern.matches("[A-Z][a-z\\s]*", name);
	}
	
	
	public static boolean contactNumberValidation(int phoneNo){
		
        return Pattern.matches("[789][0-9]*{9}", String.valueOf(phoneNo));
		
	}
	
	
	/**
	 * 
	 */
	public static void regularExpression() {
		Utility utility=new Utility();
		String message="Hello <<name>>, We have your full name as <<fullname>> in our system. "
				+ "your contact number is 91-xxxxxxxxxx. Please,"
				+ "let us know in case of any clarification Thank you BridgeLabz 01/01/2016. ";
		
		String msg=null;
		System.out.println("Enter the Fullname: ");
		String name=utility.inputStringLine();
		boolean flag=nameValidation(name);
		System.out.println("flag is: "+flag);
		System.out.println("Enter contact number: ");
		int phoneNo=utility.inputInteger();
		boolean flag1=contactNumberValidation(phoneNo);
		System.out.println("flag1 is: "+flag1);
		
		if(flag==true) {
			String[] firstname=name.split("\\s");
			System.out.println(firstname[0]);
			 msg=message.replace("<<name>>",firstname[0]);
			 msg=message.replace("<<<fullname>>", name);
			 msg=message.replace("xxxxxxxxxx", String.valueOf(phoneNo));
			 System.out.println(msg);
		}else {
			System.out.println("please enter full name,First letter should be capital");
		}
		
		System.out.println("enter the contact number: ");
		long number=utility.inputInteger();
		
		String pattern="DD-MM-YYYY";
		SimpleDateFormat sm=new SimpleDateFormat(pattern);
		String dt=sm.format(new Date());
		
//		java.util.Date dt=new java.util.Date();
		System.out.println(dt);
		msg=message.replace("01/01/2016",dt );
		System.out.println(msg);
		
	}
	
	/**
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static void stockReport()throws Exception  {
		FileReader filr=new FileReader("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/StockReport.json");
		
		JSONParser parser=new JSONParser();
	    JSONObject jsonobj=(JSONObject) parser.parse(filr);
		System.out.println(jsonobj);
		
		JSONArray array=(JSONArray)jsonobj.get("Companies");
		long total=0;
		System.out.println();
		Iterator<?> itr=array.iterator();
		while(itr.hasNext()) {
			JSONObject obj1=(JSONObject)itr.next();
			long NoOfShares=(long) obj1.get("NoOfShares");
			long shares=(long)obj1.get("SharePrice");
			long t1=NoOfShares*shares;
			obj1.put("total",t1);
			total=total+t1;
			System.out.println(obj1);
			System.out.println();
		}
		System.out.println("Total is: "+total);
	}
	/**
	 * @throws Exception
	 */
	public static void cummercialData() throws Exception {
		Utility utility=new Utility();
		System.out.println("Do you wants to createe account: ");
		String opn=utility.inputString();
		
		if(opn.equals("Yes")) {
			stockaccount();
		}
		else {
			System.out.println("OK");
		}
		System.out.println("What option u wants choose: ");
		String option=utility.inputString();
		switch(option) {
		case "buy":
			buyShares();
			break;
		case "sell":
			break;
		case "save":
			break;
		case "printreport":
			break;
			
		}
	}
	/**
	 * @throws Exception
	 */
	public static void stockaccount() throws Exception {
		
		}
	
	public static void buyShares() throws Exception {
		Utility utility=new Utility();
		System.out.println("Whose share u wants to buy: "+"\n"+"1.@ 2.! 3.#");
		String opntn=utility.inputString();
		
		System.out.println("how many number u wants to buy: ");
		int no=utility.inputInteger();
		
		FileReader file=new FileReader("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CompanyReport.json");
		JSONParser parser=new JSONParser();
		JSONObject json=(JSONObject)parser.parse(file);
		
		if(json.get("Symbole").equals(opntn)) {
			int Noshare=(int) json.get("NoOfShares");
			int priceshare=(int) json.get("SharePrice");
			int amount=no*priceshare;
			
			
		}
		
		
		
	}
}
