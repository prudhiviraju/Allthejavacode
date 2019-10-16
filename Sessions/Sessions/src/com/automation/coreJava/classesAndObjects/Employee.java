package com.automation.coreJava.classesAndObjects;

/* This example shows how to implement classes concept*/
class Employee {

	public int empID;
	public String empName;
	public String employeerName;

	public void displayEmpInfo() {
		System.out.print("EMP ID:" + empID + "\t");
		System.out.print("EMP NAME:" + empName + "\t");
		System.out.println("EMPLOYEER NAME:" + employeerName + "\t");
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.empID = 1111;
		e1.empName = "James";
		e1.employeerName = "CTS";
		e1.displayEmpInfo();

		Employee e2 = new Employee();
		e2.empID = 1112;
		e2.empName = "SCOTT";
		e2.employeerName = "CTS";
		e2.displayEmpInfo();

		Employee e3 = new Employee();
		e3.empID = 1113;
		e3.empName = "TIGER";
		e3.employeerName = "CTS";
		e3.displayEmpInfo();

	}

}
