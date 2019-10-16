package com.automation.coreJava.staticMethods;

import java.util.Scanner;

/* This example shows how to write static methods*/
class Example1 {

	public static void checkEvenAndOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("Given Number '" + number + "' is an even number");
		} else {
			System.out.println("Given Number '" + number + "' is an add number");
		}
	}

	public static void main(String[] args) {
		int number;
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter input number");
		number = console.nextInt();
		console.close();
		checkEvenAndOdd(number);
	}

}
