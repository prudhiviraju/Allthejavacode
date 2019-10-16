package com.automation.coreJava.encapsulation;

/* This example shows how to implement Encapsulation concept*/
class Employee {

	private int empID;
	private String firstName;
	private String lastName;

	public void setEmpID(int empID) {
		if (empID <= 0) {
			System.out.println("Invalid Employee ID");
			System.exit(0);
		} else {
			this.empID = empID;
		}
	}

	public void setFirstName(String firstName) {
		if ((firstName == null) | (firstName.equals(""))) {
			System.out.println("FirstName cannot be null or empty");
			System.exit(0);
		} else {
			this.firstName = firstName;
		}
	}

	public void setLastName(String lastName) {
		if ((lastName == null) | (lastName.equals(""))) {
			System.out.println("LastName cannot be null or empty");
			System.exit(0);
		} else {
			this.lastName = lastName;
		}
	}

	public void displayEmpInfo() {
		System.out.println("Employee ID:" + empID + "\t");
		System.out.println("Employee First Name:" + firstName + "\t");
		System.out.println("Employee Last Name:" + lastName + "\t");
	}

}
