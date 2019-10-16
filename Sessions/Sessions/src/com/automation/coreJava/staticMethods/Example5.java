package com.automation.coreJava.staticMethods;

import java.util.Scanner;

/* This example shows how to write static methods*/
class Example5 {

	public static void checkEvenAndOdd(){
		
		int number;
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter input number");
		System.out.println("-1 indicates terminates from program");
		number = console.nextInt();
		
		while(number!=-1){
			if (number % 2 == 0) {
				System.out.println("Given Number '" + number + "' is an even number");
			} else {
				System.out.println("Given Number '" + number + "' is an add number");
			}
			System.out.println("Please enter input number");
			number = console.nextInt();
		}
		console.close();
	}
	
	public static void main(String[] args) {
		checkEvenAndOdd();
		
	}

}
