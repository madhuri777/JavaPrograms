package com.bridgeit.programs;

import org.json.simple.JSONObject;

public class JsonEncodeDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		obj.put("name", "Madhuri");
		obj.put("course", "java");
		obj.put("Grade", 90);
		obj.put("IsVip", "true");
		System.out.println(obj);
	}

}
