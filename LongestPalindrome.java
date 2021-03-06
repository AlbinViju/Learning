package com.quest;

public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("madamman"));

	}

	private static String longestPalindrome(String s) {
		if(s.length() == 1){
			return s;
		} else {
			String longest = s.substring(0, 1);
			
			for (int i = 0; i < s.length(); i++) {
				String tmp = helper(s, i, i);
				
				if(tmp.length() > longest.length()){
					longest = tmp;
				}
				
				tmp = helper(s, i, i+1);
				
				if(tmp.length() > longest.length()){
					longest = tmp;
				}
			}
			return longest;
		}
		
	}

	private static String helper(String s, int begin, int end) {
		while(begin >= 0 && end <= s.length() -1 && s.charAt(begin) == s.charAt(end)){
			begin--;
			end++;
		}
		return s.substring(begin+1, end);
	}
	
	

}
