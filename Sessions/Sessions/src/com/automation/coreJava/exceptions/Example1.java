package com.automation.coreJava.exceptions;

/* This example shows Normal termination of a program by using try catch*/
class Example1 {

	public static void main(String[] args) {

		System.out.println("Start of the Execution");

		try {
			int result = 1000 / 0;
			System.out.println("Result:" + result);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}

		System.out.println("End of the Execution");

	}

}
