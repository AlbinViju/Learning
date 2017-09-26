package com.quest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String str = "bananas";
		
		char[] charArray = str.toCharArray();
		Map<Character, Character> map = new LinkedHashMap<Character, Character>();
		
		for (char c : charArray) {
			if(!map.containsKey(c)){
				map.put(c, c);
			}
		}
		
		for(Entry<Character, Character> entry: map.entrySet()){
			System.out.print(map.get(entry.getKey()));
		}
		

	}

}
