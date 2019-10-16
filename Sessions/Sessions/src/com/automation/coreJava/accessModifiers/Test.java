package com.automation.coreJava.accessModifiers;

/* This example shows visibility of access modifiers(private,default,protected,public) */

@SuppressWarnings("unused")
public class Test {

	private String privateVariable = "Private";
	String defaultVariable = "Default";
	protected String protectedVariable = "Protected";
	public String publicVariable = "Public";
	
	private void m1() {
		System.out.println("Test-private-m1");
	}
	
	void m2() {
		System.out.println("Test-default-m2");
	}
	
	protected void m3() {
		System.out.println("Test-protected-m3");
	}
	
	public void m4() {
		System.out.println("Test-public-m4");
	}

}
