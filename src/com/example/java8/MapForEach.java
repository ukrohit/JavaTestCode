package com.example.java8;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {

	public static void main(String[] args) {
		
		Map<String,String> countryCapitalMap = new HashMap<>();
		countryCapitalMap.put("US", "Wshington DC");
		countryCapitalMap.put("England", "London");
		countryCapitalMap.put("France", "Paris");
		
		countryCapitalMap.forEach((k,v)->System.out.print(""));
		
		MapForEach.iterateThroughMap(countryCapitalMap);
	}
	
	public static void iterateThroughMap(Map<?,?> map){
	    map.forEach((k,v) -> {System.out.println("Key: "+k+" Value: "+v);});
	}

}
