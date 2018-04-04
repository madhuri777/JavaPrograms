package com.bridgeit.programs;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimplWriteExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		JSONObject obj=new JSONObject();
		obj.put("Name","Madhuri");
		obj.put("Age",23);
		
		JSONArray obj2=new JSONArray();
		obj2.add("msg 1");
		obj2.add("msg 2");
		obj2.add("msg 3");
		
		obj.put("messages",obj2);
		
		try(FileWriter file=new FileWriter("/home/bridgeit/eclipse-works8/ObjectOrientedPrograms/JSONFIRSTFILE.json")){
			file.write(obj.toJSONString());
			file.flush();
		}catch(Exception e) {
			System.out.println(e);
		}
   System.out.print(obj);
	}

}
