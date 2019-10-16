package com.automation.coreJava.inheritance;

/* This example shows how to implement inheritance concept*/
class TestScript04 {

	public void login() {
		System.out.println("Login Functionality");
	}

	public void transaction() {
		System.out.println("Transaction Functionality");
	}

	public void logout() {
		System.out.println("Logout Functionality");
	}

	public static void main(String[] args) {
		TestScript04 script04 = new TestScript04();
		script04.login();
		script04.transaction();
		script04.logout();
	}

}
