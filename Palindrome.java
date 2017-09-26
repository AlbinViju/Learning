package com.quest;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String newStr = "";
		
		for (int i = str.length(); i > 0; i--) {
			newStr += str.charAt(i-1);
		}
		
		if(str.equals(newStr)){
			System.out.println(str +" is Palindrome");
		} else {
			System.out.println(str +" is not a Palindrome");
		}

	}

}
