package com.bridgeit.programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFromFile {

	public static void main(String[] args) throws Exception {
	try {
		
		JSONParser parser=new JSONParser();
	Object obj=parser.parse(new FileReader("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/JSONFIRSTFILE.json"));
      JSONObject jsonobj=(JSONObject) obj;
      System.out.println(jsonobj);
      
      String name=(String)jsonobj.get("Name");
      System.out.println(name);
      
      long age=(long)jsonobj.get("Age");
      System.out.println(age);
      
      JSONArray msg=(JSONArray)jsonobj.get("messages");
      
      Iterator<?> itr=msg.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
      
	}catch(FileNotFoundException e) {
		System.out.println(e);
	}catch(IOException e) {
		System.out.println(e);
	}catch(ParseException e) {
		System.out.println(e);
	}
      
	}

}
