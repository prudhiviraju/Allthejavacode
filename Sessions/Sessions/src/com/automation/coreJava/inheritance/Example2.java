package com.automation.coreJava.inheritance;

/* This example shows how to use super(@variable level and @method Level) keyword*/
class Super {

	String language = "Java";

	void displayInformation() {
		System.out.println("Super Class Variable Language:" + language);
	}
}

class Sub extends Super {

	String language = "C#";

	void displayInformation() {
		System.out.println("Super Class Variable Language:" + super.language);
		System.out.println("Sub Class Variable Language:" + language);
	}

	void display() {
		displayInformation();
		super.displayInformation();
	}

}

class Example2 {
	public static void main(String[] args) {
		Super s = new Super();
		s.displayInformation();

		Sub sub = new Sub();
		sub.displayInformation();
		sub.display();
	}
}
