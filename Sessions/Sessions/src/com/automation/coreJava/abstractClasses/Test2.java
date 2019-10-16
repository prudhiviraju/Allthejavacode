package com.automation.coreJava.abstractClasses;

/* This example shows How to declare abstract class*/
abstract class Example2 {
	
	public Example2(){
		System.out.println("Example2 Constructor");
	}
	
	@SuppressWarnings("unused")
	private void m1(){
		System.out.println("This is m1 method()");
	}
	
	void m2(){
		System.out.println("This is m2 method()");
	}
	
	protected void m3(){
		System.out.println("This is m3 method()");
	}

	public void m4(){
		System.out.println("This is m4 method()");
	}
	
	public static void m5(){
		System.out.println("This is m5 method()");
	}
}

class Test2 extends Example2{
	
	public Test2(){
		System.out.println("Test2 constructor");
	}
	public static void main(String[] args) {
		
		Example2.m5();
		
		Test2 test2 = new Test2();
		
		test2.m2();
		test2.m3();
		test2.m3();
		test2.m4();
		Test2.m5();
		
		
	}
	
}

