package com.automation.coreJava.polymorphism.compileTimePloymorphism;

/* This example shows how to implement method overloading concept*/
class Overload {
	
	public void m1() {
		System.out.println("No parameters");
	}

	public void m1(int a) {
		System.out.println("One parameter: " + a);
	}

	public int m1(int a, int b) {
		System.out.println("Two parameters: " + a + " " + b);
		return a + b;
	}

	public double m1(double a, double b) {
		System.out.println("Two double parameters: " + a + " " + b);
		return a + b;
	}
}

class OverloadTest1 {

	public static void main(String[] args) {
		Overload overload = new Overload();
		overload.m1();
		overload.m1(10);
		overload.m1(10,20);
		overload.m1(10.5,20.5);
		overload.m1(10,20.5);
	}

}
