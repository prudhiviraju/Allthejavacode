package com.automation.coreJava.decisionMaking;

import java.util.Scanner;

/* Example to show how to use if-else if condition */
class Example2 {

	public static void main(String[] args) {

		int passMarks;

		int marksObtained;

		char grade;

		passMarks = 35;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter marks obtained by you");

		marksObtained = input.nextInt();
		
		input.close();

		if (marksObtained >= passMarks) {
			if (marksObtained > 90) {
				grade = 'A';
			} else if (marksObtained > 75) {
				grade = 'B';
			} else if (marksObtained > 60) {
				grade = 'C';
			} else {
				grade = 'D';
			}
			System.out.println("You 'PASS' the exam and Grade is '" + grade	+ "'");
		} else {
			grade = 'F';
			System.out.println("You 'FAIL' the exam and Grade is '" + grade	+ "'");
		}
	}

}
