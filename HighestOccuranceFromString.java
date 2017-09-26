package com.quest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HighestOccuranceFromString {

	public static void main(String[] args) {
		String str = "aaaaaaaaaaaaaaaaabbbbcddddeeeeeeeeeeeeeeeeeee";
		Integer maxValue = 0;
		String maxChar = "";
		
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (char c : charArray) {
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		
		for(Entry<Character, Integer> entry: map.entrySet()){
			if(entry.getValue() > maxValue){
				maxValue = entry.getValue();
				maxChar = entry.getKey().toString();
			}
		}
		
		System.out.println(maxChar);
		

	}

}
