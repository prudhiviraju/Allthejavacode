package com.automation.coreJava.accessModifiers.differentPackage;

import com.automation.coreJava.accessModifiers.Test;

/* This example shows visibility of protected and public access modifiers(outside class which is in different package) */
public class Example4 extends Test {

	public void displayInformation() {
		System.out.println(publicVariable);
		System.out.println(protectedVariable);
		m3();
	}
	
	public static void main(String[] args) {
		Example4 example4 = new Example4();
		example4.displayInformation();

	}

}
