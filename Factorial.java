package com.quest;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		
		for(int i=1; i<= num; i++){
			fact = fact*i;
		}
		
		System.out.println(fact);
		
		int num1 = 4;
		System.out.println(fact(num1));

	}

	private static int fact(int n) {
		if(n == 0){
			return 1;
		} else {
			return (n * fact(n-1));
		}
		
	}

}
