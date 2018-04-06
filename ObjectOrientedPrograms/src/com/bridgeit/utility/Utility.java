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
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
	
	
	public static boolean contactNumberValidation(String phoneNo){
		
        return Pattern.matches("[789][0-9]*{9}", phoneNo);
		
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
	
		String[] fname=name.split("\\s");
		
		
		System.out.println("Enter contact number: ");
		String phoneNo=utility.inputString();

		boolean flag1=contactNumberValidation(phoneNo);
		
		
		if(flag==true&&flag1==true) {
			
			msg=message.replace("<<name>>",fname[0].toString());
			
			msg=msg.replace("<<fullname>>",name);
			
			 msg=msg.replace("xxxxxxxxxx", phoneNo.toString());
			
			 
			 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy ");  
			    Date date = new Date();  
			     formatter.format(date);  
		
			msg=msg.replace("01/01/2016",formatter.format(date));
			System.out.println(msg);
			 
			 
		}else {
			System.out.println("please enter full name,First letter should be capital And correct phone number");
		}
		
		
		
		
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
		System.out.println("choose the option: ");
		int choice=utility.inputInteger();
		switch(choice){
		case 1:
			stockAccount();
			break;
		case 2:
			System.out.println("Enter the symbol of compny: ");
			String symbol=utility.inputString();
			buyShares(symbol);
			break;
		case 3:
			System.out.println("ENter number to sell share :");
			int num=utility.inputInteger();
			sellShares(num);
			break;
		case 4:
			reportRecord();
			break;
		}
			
	}
		
	
	/**
	 * @param amount
	 * @param symbol
	 * @throws Exception
	 */
	public static void buyShares( String symbol) throws Exception {
		Utility utility=new Utility();
		FileReader f1=new FileReader("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CustomerReport.json");
		JSONParser parser1=new JSONParser();
		JSONArray cutm=(JSONArray)parser1.parse(f1);
		
		FileReader f2=new FileReader("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CompanyReport.json");
		JSONParser parser2=new JSONParser();
	    JSONArray comp=(JSONArray)parser2.parse(f2);
		
		@SuppressWarnings("rawtypes")
		Iterator iterator1=cutm.iterator();
		@SuppressWarnings("rawtypes")
		Iterator iterator2=comp.iterator();

		System.out.println("enter the user name: ");
		String name=utility.inputString();
		
		//customer file iteration
		while(iterator1.hasNext()) {
			JSONObject obj=(JSONObject)iterator1.next();
			
			//checking for user name
			if(obj.get("Name").equals(name)) {
				
				//company file iteration
				   while(iterator2.hasNext()) {
					   JSONObject obj1=(JSONObject) iterator2.next();
					   
					   //check for company symbol
					   if(obj1.get("Symbole").equals(symbol)) {
						   System.out.println("how many shares u wants to buy: ");
							int n=utility.inputInteger();
							
							int noOfShares=Integer.parseInt(obj.get("NoOfShares").toString());
							System.out.println("price of share is : "+noOfShares);
							int bals=Integer.parseInt(obj.get("balance").toString());
							System.out.println("customer balance "+bals);
							
						    int amt=Integer.parseInt(obj1.get("SharePrice").toString()); 
						    System.out.println("price per share is : "+amt);
						    int no=Integer.parseInt(obj1.get("NoOfShares").toString());
						    System.out.println("NoOfShare is : "+no);
						    
						    int totalprice=n*amt;
						    int totalshare=noOfShares+n;
						    int newbals=bals-totalprice;
						    int compyshare=no-n;
						    System.out.println("price of ompnyshare is : "+compyshare);
						   
						   obj.remove("NoOfShares");
						   obj.remove("balance");
						   obj1.remove("NoOfShares");
						   
						   obj.put("NoOfShares",totalshare);
						   obj.put("balance",newbals);
						   obj1.put("NoOfShares", compyshare);
				   
						   break;
					   }
				   }	   
			
			}
			
			FileWriter ft=new FileWriter("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CustomerReport.json");
			ft.write(JSONValue.toJSONString(cutm));
			ft.flush();
			ft.close();
				
		}

		FileWriter fr=new FileWriter("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CompanyReport.json");
		   fr.write(JSONValue.toJSONString(comp));
		   fr.flush();
		   fr.close();
		
		}
		
		
	/**
	 * @param num
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static void sellShares(int num) throws Exception {
		System.out.println("No of shares are "+num);
		Utility utility=new Utility();
		FileReader fr=new FileReader("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CompanyReport.json");
		JSONParser parser=new JSONParser();
		JSONArray array=(JSONArray)parser.parse(fr);
		Iterator itr=array.iterator();
		
		FileReader ft=new FileReader("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CustomerReport.json");
		JSONParser parser2=new JSONParser();
		JSONArray array1=(JSONArray)parser2.parse(ft);
		@SuppressWarnings("rawtypes")
		Iterator itrt=array1.iterator();
		
		
		System.out.println("Enter the user name: ");
		String name=utility.inputString();
		
		System.out.println("Enter symbole of compny to sell shares: ");
		String symbol=utility.inputString();
		
		while(itrt.hasNext()) {
			//System.out.println(itr.next());
			
			JSONObject obj=(JSONObject) itrt.next();
			
			if(obj.get("Name").equals(name)) {
				System.out.println("hii pointr is here ");
				while(itr.hasNext()) {
					JSONObject obj1=(JSONObject) itr.next();
					if(obj1.get("Symbole").equals(symbol)) {
						int price=Integer.parseInt(obj1.get("SharePrice").toString());
						
						int bill=price*num;
						System.out.println("bill is:"+bill);
						int compnayshare=Integer.parseInt(obj1.get("NoOfShares").toString());
						int newshareofcomp=compnayshare+num;
						obj1.remove("NoOfShares");
						obj1.put("NoOfShares",newshareofcomp);
						
						int bal=Integer.parseInt(obj.get("balance").toString());
						int newBalance=bal+bill;
						System.out.println("newBalance is +"+newBalance);
						obj.remove("balance");
						obj.put("balance",newBalance);
						
						int numofshares=Integer.parseInt(obj.get("NoOfShares").toString());
						int newshares=numofshares-num;
						System.out.println("remaining shares are:"+ newshares);
						obj.remove("NoOfShares");
						obj.put("NoOfShares", newshares);	
						break;
					}
				}
			}
			FileWriter ft1=new FileWriter("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CustomerReport.json");
			ft1.write(JSONValue.toJSONString(array1));
			ft1.flush();
			ft1.close();
		}
		FileWriter fr1=new FileWriter("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CompanyReport.json");
		   fr1.write(JSONValue.toJSONString(array));
		   fr1.flush();
		   fr1.close();	
	}
	
	
	public static void reportRecord() throws Exception {
		FileReader file=new FileReader("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CustomerReport.json");
		JSONParser parser=new JSONParser();
		JSONArray array=(JSONArray)parser.parse(file);
		@SuppressWarnings("rawtypes")
		Iterator iterator=array.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	@SuppressWarnings({ "unchecked" })
	public static void stockAccount() throws Exception {
		  JSONParser parser=new JSONParser();
		  FileReader fr=new FileReader("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CustomerReport.json");
		  JSONArray array=(  JSONArray) parser.parse(fr);
	     
		   Utility utility=new Utility();
		
	   	System.out.println("wants new account: ");
		JSONObject obj=new JSONObject();
		
		System.out.println("Enter the name of customer: ");
		String name=utility.inputString();
		
		System.out.println("Enter numbers od shares: ");
		int shares=utility.inputInteger();
		
		System.out.println("enter balance: ");
		int balc=utility.inputInteger();
		
		obj.put("Name",name);
		obj.put("NoOfShares",shares);
		obj.put("balance",balc);
		
		array.add(obj);
		
		try(FileWriter fw=new FileWriter("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CustomerReport.json")){
			fw.write(array.toJSONString());
			fw.flush();
			fw.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}		
}
	
	@SuppressWarnings({"rawtypes","unused", "unchecked"})
	public static void compnyLinkedList() throws Exception {
		Utility utility=new Utility();
		FileReader fr=new FileReader("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CompanyReport.json");
		JSONParser parser=new JSONParser();
		JSONArray array=(JSONArray)parser.parse(fr);
		
		LinkedList1 symbol=new LinkedList1();
		LinkedList1 price=new LinkedList1();
		LinkedList1 count=new LinkedList1();
		
		Iterator itr=array.iterator();
	    
		while(itr.hasNext()) {
			JSONObject obj=(JSONObject)itr.next();
			System.out.println();
			String symbl=obj.get("Symbole").toString();
			symbol.add(symbl);
			System.out.println();
			
			int shareprice=Integer.parseInt(obj.get("SharePrice").toString());
			price.add(shareprice);
		
		   int cnt=Integer.parseInt(obj.get("NoOfShares").toString());
		   count.add(cnt);
		}
		System.out.print("Symbols of companies:  ");
		symbol.show();
		System.out.println();
		System.out.print("Price of shares:  ");
		price.show();
		System.out.println();
		System.out.print("Numbers of shares:  ");
		count.show();
	     //addRecordInLinkedList();
		
	}
	
	
	public static void addRecordInLinkedList() throws Exception {
		Utility utility=new Utility();
		
		FileReader fr=new FileReader("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CompanyReport.json");
		JSONParser parser=new JSONParser();
		JSONArray array=(JSONArray)parser.parse(fr);
		
		
		LinkedList1 symbol=new LinkedList1();
		LinkedList1 price=new LinkedList1();
		LinkedList1 count=new LinkedList1();
		
		
		JSONObject obj=new JSONObject();
		System.out.println("Enter the symbol of company ");
		String symbl1=utility.inputString();
		symbol.add(symbl1);
		obj.put("Symbole",symbl1);
		
		System.out.println("Enter the number of shares of compny: ");
		int num=utility.inputInteger();
		count.add(num);
		obj.put("NoOfShares",num);
		
		System.out.println("Enter the price for share: ");
		int pric=utility.inputInteger();
		price.add(pric);
		obj.put("SharePrice",pric);
		//obj.put("SharePrice",price.get());
		//obj.put(key, value)
		array.add(obj);
		
		FileWriter fw=new FileWriter("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/CompanyReport.json");
		fw.write(array.toJSONString());
		fw.flush();
		fw.close();
	}

	public static void deckOfCards() {
		String [] suit= {"Clubs","Diamonds","Hearts","Spades"};
		String [] rank= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		String[] deck=new String[52];
		
		for(int i=0;i<rank.length;i++) {
			for(int j=0;j<suit.length;j++) {
				deck[suit.length*i+j]=rank[i]+" => "+suit[j];
			}
		}
		
		for(int i=0;i<52;i++) {
			int r=(int)(Math.random()*(52-i));
			//System.out.println("   "+r);
			String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
		}
		
		int l=0;
		String[][] twod=new String[4][9];
		for(int q=0;q<4;q++) {
			System.out.print("player: "+q);
			for(int p=0;p<9;p++) {
			  twod[q][p]=deck[l++];
			  System.out.print("\t"+twod[q][p]+"\t\t");
			}
			System.out.println();	
		}
		sortQueueLinkedlist(twod);
	}
	
	public static void cardesWithQueue() {
		QueueLinkedList playr=new QueueLinkedList();
		
		String [] suit= {"Clubs","Diamonds","Hearts","Spades"};
		String [] rank= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		String[] deck=new String[52];
		
		for(int i=0;i<rank.length;i++) {
			for(int j=0;j<suit.length;j++) {
				deck[suit.length*i+j]=rank[i]+" => "+suit[j];
			}
		}
		
		for(int i=0;i<52;i++) {
			int r=(int)(Math.random()*(52-i));
			//System.out.println("   "+r);
			String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
		}
		int l=0;
		String[][] twod=new String[4][9];
		for(int p=0;p<4;p++) {
			//System.out.println("player : "+p);
			playr.enQueue("player");
			playr.enQueue(p);
			playr.enQueue("\t");
			for(int q=0;q<9;q++) {
				twod[p][q]=deck[l++];
				playr.enQueue(twod[p][q]);
				playr.enQueue("\t");
				playr.enQueue("\t");
			}
			playr.enQueue("\n");
		}
		playr.show();
}
  /**
 * @param twoD
 */
public static void sortQueueLinkedlist(String[][] twoD) {
		QueueLinkedList playr=new QueueLinkedList();
       System.out.println();
	  System.out.println("After sorting in queue: ");
	  System.out.println();
		String [] rank= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

		int capacity=9;
		String[] cards=new String[capacity];
		  for(int j=0;j<4;j++) {
			  for(int k=0;k<9;k++) {
				   cards[k]=twoD[j][k];
				  }
			
			  for(int i=0;i<rank.length;i++) {
				  
			  for(int z=0;z<9;z++) {
			  if(cards[z].charAt(0)==rank[i].charAt(0)) {
				  playr.enQueue(cards[z]);
				  playr.enQueue("\t");
			  }
			  }
			  }
			  playr.enQueue("\n");
		  }
	  playr.show();
  }
}
		