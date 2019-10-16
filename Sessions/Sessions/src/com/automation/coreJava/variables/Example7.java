package com.automation.coreJava.variables;

/* This example shows how to compare Integer,Double data types*/
class Example7 {

	public static void main(String[] args) {
		
		Integer num1 = new Integer(9999);
		Integer num2 = new Integer(9999);
		System.out.println("==:" + (num1 == num2));
		System.out.println("Equals:"+num1.equals(num2));
		
		Double num3 = new Double(9999.99);
		Double num4 = new Double(9999.99);
		System.out.println("==:" + (num3 == num4));
		System.out.println("Equals:"+num3.equals(num4));
		
	}

}
