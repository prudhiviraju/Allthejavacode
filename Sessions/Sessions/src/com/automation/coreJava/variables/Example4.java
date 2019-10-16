package com.automation.coreJava.variables;

/* This example shows how to compare String data types*/
class Example4 {

	public static void main(String[] args) {
		
		String s1 = new String("SELENIUM");
		String s2 = new String("SELENIUM");
		
		System.out.println("==:" + (s1 == s2));
		System.out.println("Equals:"+s1.equals(s2));
		
		String s3 = "SELENIUM";
		String s4 = "SELENIUM";
		
		System.out.println("==:" + (s3 == s4));
		System.out.println("Equals:"+s3.equals(s4));

	}

}
