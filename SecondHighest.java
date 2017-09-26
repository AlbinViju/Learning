package com.quest;

public class SecondHighest {

	public static void main(String[] args) {
		int numbers[] = {6,3,37,12,46,5,64,21};
		int highest = 0;
		int second_highest = 0;
		
		for (int i : numbers) {
			if(highest > i){
				second_highest = highest;
				highest = i;
			} else if(second_highest > i){
				second_highest = i;
			}
		}
		
		System.out.println(second_highest);

	}

}
