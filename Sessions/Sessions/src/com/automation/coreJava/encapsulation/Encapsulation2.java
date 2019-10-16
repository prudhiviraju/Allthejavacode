package com.automation.coreJava.encapsulation;

/* This example shows how to implement Encapsulation concept*/
class Encapsulation2 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmpID(-1);
		e1.setFirstName("");
		e1.setLastName("");
		e1.displayEmpInfo();
	}
}
