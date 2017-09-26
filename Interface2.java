package com.quest;

public interface Interface2 {
	
	public void method1();
	
	public void method2();
	
	default void method4(){
		System.out.println("Hi Interface2");
	}

}
