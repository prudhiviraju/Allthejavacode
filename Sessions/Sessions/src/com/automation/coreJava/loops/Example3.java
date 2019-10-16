package com.automation.coreJava.loops;

import java.util.Scanner;

/* Example to show how to use for statement */
/* Sum from start number to end Number */
class Example3 {

	public static void main(String[] args) throws Exception {

		int startNumber;
		int endNumber;
		int sum = 0;

		Scanner console = new Scanner(System.in);
		System.out.println("Enter Start Number:");
		startNumber = console.nextInt();

		System.out.println("Enter End Number:");
		endNumber = console.nextInt();
		console.close();

		for (int counter = startNumber; counter <= endNumber; counter++) {
			sum = sum + counter;
		}

		System.out.println("Sum of " + startNumber + " to " + endNumber + " is :" + sum);
	}

}
