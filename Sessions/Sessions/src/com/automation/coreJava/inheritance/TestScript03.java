package com.automation.coreJava.inheritance;

/* This example shows how to implement inheritance concept*/
class TestScript03 {

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
		TestScript03 script03 = new TestScript03();
		script03.login();
		script03.transaction();
		script03.logout();
	}

}
