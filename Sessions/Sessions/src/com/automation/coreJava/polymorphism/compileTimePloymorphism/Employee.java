package com.automation.coreJava.polymorphism.compileTimePloymorphism;

/* This example shows how to implement Constructor Overloading */
class Employee {

	private int empID;
	private String empName;
	private String employeerName;

	public Employee(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
		employeerName = "TCS";
	}

	public Employee(int empID, String empName, String employeerName) {
		this.empID = empID;
		this.empName = empName;
		this.employeerName = employeerName;
	}

	public void displayEmpInfo() {
		System.out.print("Employee ID:" + empID + "\t");
		System.out.print("Employee Name:" + empName + "\t");
		System.out.println("EmployeerName:" + employeerName);
	}

	public static void main(String args[]) {
		Employee e1 = new Employee(1111,"SCOTT","TCS");
		Employee e2 = new Employee(1112,"TIGER");
		Employee e3 = new Employee(1113,"RAMKI","TCS");
		e1.displayEmpInfo();
		e2.displayEmpInfo();
		e3.displayEmpInfo();
	}

}
