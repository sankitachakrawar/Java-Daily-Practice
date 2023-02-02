package com.example.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
		
		Map<String, String> languages=new HashMap<>();
		languages.put("l3", "python");
		languages.put("l2", "java");
		languages.put("l1","c#");
		
		System.out.println(languages);
		
		TreeMap<String, String> sortedNumbers = new TreeMap<>(languages);
	    System.out.println("Map with sorted Key" + sortedNumbers);
	}
}
