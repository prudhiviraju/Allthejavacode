package com.automation.coreJava.polymorphism.compileTimePloymorphism;

/* This example shows how to implement overloading concept*/
class Example1 {
	
	public void m1(){
		System.out.println("m1-0");
	}
	
	public void m1(double i){
		System.out.println("m1-1-double:"+i);
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.m1();
		example1.m1(100);
		example1.m1(99.99);
	}

}
