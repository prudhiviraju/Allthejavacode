package com.automation.coreJava.variables;

/* This example shows how to compare primitive data types*/
class Example3 {

	public static void main(String[] args) {
		
		int empID1 = 1111;
		
		int empID2 = 1112;
		
		System.out.println("Compare int data Types:" + (empID1 == empID2));
		
		double item1Price = 99.99;
		
		double item2Price = 999.99;
		
		System.out.println("Compare double data Types:" + (item1Price == item2Price));
		
		boolean status1 = true;
		
		boolean status2 = false;
		
		System.out.println("Compare boolean data Types:" + (status1 == status2));
		
		char gender1 = 'M';
		
		char gender2 = 'F';
		
		System.out.println("Compare char data Types:" + (gender1 == gender2));
		
		 
	}

}
