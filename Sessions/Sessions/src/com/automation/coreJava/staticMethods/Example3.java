package com.automation.coreJava.staticMethods;

import java.util.Scanner;

/* This example shows how to write static methods*/
class Example3 {

	public static void sum(int startNumber, int endNumber) {
		int sum = 0;
		for (int counter = startNumber; counter <= endNumber; counter++) {
			sum = sum + counter;
		}
		System.out.println("Sum from " + startNumber + " to " + endNumber + " is :" + sum);
	}

	public static void main(String[] args) {
		int startNumber, endNumber;
		System.out.println("Enter Start Number:");
		Scanner console = new Scanner(System.in);
		startNumber = console.nextInt();
		System.out.println("Enter End Number:");
		endNumber = console.nextInt();
		console.close();
		sum(startNumber, endNumber);

	}

}
