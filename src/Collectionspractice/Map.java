package Collectionspractice;

import java.util.HashMap;

public class Map {


	public static void main(String[] args) {
		
		HashMap<String, String> name = new HashMap<String , String>();
		

		name.put("Firstname","prudhvi");
		name.put("Surname","yeddula");
		name.put("brother","Chandhu");
		name.put(null, null);
		System.out.println(name);
		
	}
	
}
