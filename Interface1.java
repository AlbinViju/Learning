package com.quest;

public interface Interface1 {
	
	public void method1();
	
	public void method2();
	
	default void method3(){
		System.out.println("Hi Interface1");
	}

}
