package com.esc.datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	// A hashmap takes up more space. Searching is faster with it.
	public static void main(String[] args) {
		Map<String, Integer> numberMap = new HashMap<>();
		
		numberMap.put("one", 1);
		numberMap.put("two", 2);
		numberMap.put("three", 3);
		numberMap.put("four", 4);
		
		System.out.println(numberMap.get("two"));
		System.out.println(numberMap.values());
		System.out.println(numberMap.keySet());
		
		System.out.println(numberMap.remove("three"));
		System.out.println(numberMap.values());
		System.out.println(numberMap.keySet());

	}

}
