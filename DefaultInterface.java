package com.quest;

public class DefaultInterface implements Interface1, Interface2{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		Interface2.super.method4();
		System.out.println("In DefaultInterface");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		Interface1.super.method3();
	}
	
	public static void main(String[] args) {
		DefaultInterface defaultInterface = new DefaultInterface();
		defaultInterface.method3();
	}

}
