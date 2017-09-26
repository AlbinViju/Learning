package com.quest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedCharacterFromString {

	public static void main(String[] args) {
		String str = "Morning";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if(map.containsKey(c)){
				int count = (int) map.get(c) + 1;
				map.put(c, count);
			} else {
				map.put(c, 1);
			}
		}
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if(map.get(entry.getKey()) > 1){
				System.out.println(entry.getKey());
			}
		}

	}

}
