package org.programes;

import java.util.HashMap;
import java.util.Map;

public class Programes {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		Map<String,Integer> hm = new HashMap<>();
		hm.put("First", 1);
		hm.put("Second", 2);
		hm.put("Third", 3);
		hm.put("Four", 4);
		hm.put("Five", 5);
		hm.put("Six",6);
	
		for(Map.Entry<String, Integer> e: hm.entrySet()) {
			
			System.out.println("Key = "+ e.getKey() + ", Value = " + e.getValue());
		}
	}

}
