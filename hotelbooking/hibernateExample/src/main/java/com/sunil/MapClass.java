package com.sunil;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
		map.put("C++", 45);
		map.put("Java2Novice", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Why this kolavari", 93);
		
		
		map.forEach((k,v)->System.out.println(k+" "+v));

	}
}
