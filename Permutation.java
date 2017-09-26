package com.quest;

public class Permutation {

	public static void main(String[] args) {
		
		permute("", "abc");

	}

	private static void permute(String beginningString, String endingString) {
		if(endingString.length() <= 1)
			System.out.println(beginningString+endingString);
		 else 
			for (int i = 0; i < endingString.length(); i++) {
				try {
					String newString = endingString.substring(0, i) + endingString.substring(i+1);
					
					permute(beginningString+endingString.charAt(i), newString);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		
		
	}

}
