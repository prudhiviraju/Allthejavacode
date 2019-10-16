package com.automation.coreJava.loops;

import java.util.Scanner;

/* Example to show how to use for statement and it's calculate Factorial of a number */
class Example4 {

	public static void main(String[] args) throws Exception {

		int factorial = 1;
		int number;

		System.out.println("Enter a number to calculate it's factorial");
		Scanner console = new Scanner(System.in);
		number = console.nextInt();
		console.close();

		if (number < 0) {
			System.out.println("Number should be > 0");
		} else {
			for (int counter = 1; counter <= number; counter++) {
				factorial = factorial * counter;
			}
			System.out.println("Factorial of " + number + " is " + factorial);
		}
	}

}
