package com.automation.coreJava.encapsulation;

class Employe {
	
	public int empID;
	public String firstName;
	public String lastName;

	public void displayEmpInfo() {
		System.out.println("Employee ID:" + empID + "\t");
		System.out.println("Employee First Name:" + firstName + "\t");
		System.out.println("Employee Last Name:" + lastName + "\t");
	}

}

class Encapsulation1 {
	public static void main(String[] args) {
		Employe e1 = new Employe();
		e1.empID = -1;
		e1.firstName = "SCOTT";
		e1.lastName = "TIGER";
		e1.displayEmpInfo();
	}
}

