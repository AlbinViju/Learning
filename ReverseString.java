package com.quest;


public class ReverseString {

	public static void main(String[] args) {
		String str = "Morning";
		String newStr = "";
		
		char[] charArray = str.toCharArray();
		for (int i=str.length(); i > 0; i--) {
			newStr += charArray[i-1];
		}
		
		System.out.println(newStr);
		
		String str1 = "123456";
		
		if(str.matches("[a-zA-Z]+")){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		String str2 = "aeiou abc";
		int count = 0;
		String newStr2 = "";
		char[] charArray2 = str2.toCharArray();
		for (char c : charArray2) {
			if(String.valueOf(c).equals(" ")){
				newStr2 += "%20";
			} else {
				newStr2 += String.valueOf(c);
			}
		}
		
		System.out.println(newStr2);
		

	}

}
