package com.automation.coreJava.polymorphism.compileTimePloymorphism;

/* This example shows how to implement method Overloading */
public class Calculator {
	
	private void add() {
		System.out.println("add-0");
	}
	
	void add(int number1) {
		System.out.println("add-int-1:" + number1);
	}
	
	protected void add(int number1,int number2) {
		System.out.println("add-int-2:" + (number1+number2));
	}
	
	protected void add(double number1,double number2) {
		System.out.println("add-double-2:" + (number1+number2));
	}
	
	protected void add(int number1,double number2) {
		System.out.println("add-int double-2:" + (number1+number2));
	}
	
	protected void add(double number1,int number2) {
		System.out.println("add-double int-2:" + (number1+number2));
	}
	
	public void add(int number1,int number2,int number3) {
		System.out.println("add-int-3:" + (number1+number2+number3));
	}

	public static void add(int... numbers) {
		int sum = 0;
		for (int counter = 0; counter < numbers.length; counter++) {
			sum = sum + numbers[counter];
		}
		System.out.println("add-int-varg-" + numbers.length + ";" + sum);
	}
	
	public final static void add(double... numbers) {
		double sum = 0;
		for (int counter = 0; counter < numbers.length; counter++) {
			sum = sum + numbers[counter];
		}
		System.out.println("add-double-varg-" + numbers.length + ";" + sum);
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add();
		calc.add(1111);
		calc.add(8888, 9999);
		calc.add(8888.99, 9999.99);
		calc.add(8888, 9999.99);
		calc.add(8888.88, 9999);
		Calculator.add(8888,9999,1111,2222);
		Calculator.add(8888,9999,1111,2222.22);
	}
}
