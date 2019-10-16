package com.automation.coreJava.inheritance;

/* This example shows how to implement inheritance concept*/

class BaseScript {
	
	public void login() {
		System.out.println("Login Functionality");
	}

	public void logout() {
		System.out.println("Logout Functionality");
	}
}

class TestScript05 extends BaseScript {

	public void transaction() {
		System.out.println("Transaction Functionality");
	}

	public static void main(String[] args) {
		TestScript05 script05 = new TestScript05();
		script05.login();
		script05.transaction();
		script05.logout();
	}

}
