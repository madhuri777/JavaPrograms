package com.bridgeit.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;

public class StudentRecord {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of student:");
		String name=sc.next();
		
		System.out.println("Enter the course name:");
		String course=sc.next();
		
		System.out.println("Enter the grade:");
		int grade=sc.nextInt();
		
		//sc.close();
		
		//create new JSON Object
		JSONObject root=new JSONObject();
		root.put("name", name);
		
		//create a JSON object and array and store a class object in it
         JSONObject course1=new JSONObject();
		 course1.put("course", course);
		 course1.put("grade", grade);
		 
		 
		 JSONArray courseArray=new JSONArray();
		 courseArray.add(course1);	 
		 
		 root.put("corses", courseArray);
		 
		 System.out.println(root.toJSONString());
		 
		 JSONParser parser=new JSONParser();
		 //Now we create a file and and read JSON structure in it
		 File file=new File("JSONFIRSTFILE.json");
		 try{
			 PrintWriter writer=new PrintWriter(file);
			 writer.print(root.toJSONString());
			 System.out.println("Succesfully copied data into json file");
		 }catch(FileNotFoundException e) {
			 System.out.println(e);
		 }
		 
		 
		 
		 
	}

}
