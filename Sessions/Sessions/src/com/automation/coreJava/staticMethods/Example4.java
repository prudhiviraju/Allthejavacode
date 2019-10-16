package com.automation.coreJava.staticMethods;

import java.util.Scanner;

/* This example shows how to write static methods*/
class Example4 {
	
	public static int findMax(int num1, int num2) {
		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static void main(String[] args) {
		int num1,num2;
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter two input numbers");
		num1 = console.nextInt();
		num2 = console.nextInt();
		console.close();
		int result = findMax(num1, num2);
		System.out.println("The larger of "	+ num1 + " and " + num2 + " is " + result);

		
	}

}
