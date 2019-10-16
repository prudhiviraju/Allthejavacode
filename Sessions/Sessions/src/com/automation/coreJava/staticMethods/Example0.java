package com.automation.coreJava.staticMethods;

import java.util.Scanner;

/* This example shows how to write static methods*/
class Example0 {

	public static void main(String[] args) {
		int number;
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter input number");
		number = console.nextInt();
		console.close();
		if (number % 2 == 0) {
			System.out.println("Given Number '" + number + "' is an even number");
		} else {
			System.out.println("Given Number '" + number + "' is an add number");
		}
	}
}
