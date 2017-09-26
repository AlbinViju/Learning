package com.quest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpression1 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
							  new Person("Albin", "Viju", 32),
							  new Person("Sweena", "Vijay", 27),
							  new Person("Ivana", "Albin", 2)
				);
		
		// Sort based on last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// method to print all
		printConditionally(people, p -> true);
		
		// method to print which is last name starts with V
		printConditionally(people, p -> p.getLastName().startsWith("A"));
		

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if(predicate.test(person)){
				System.out.println(person);
			}
		}
		
	}
		

}
