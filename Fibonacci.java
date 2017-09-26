package com.quest;

public class Fibonacci {

	public static void main(String[] args) {
		int febCount = 15;
		int[] fibonacci = new int[febCount];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int i=2; i < febCount; i++){
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		
		for (int i : fibonacci) {
			System.out.println(i);
		}

	}

}
