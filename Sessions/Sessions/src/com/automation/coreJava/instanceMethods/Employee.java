package com.automation.coreJava.instanceMethods;

/* This example show how to write instance method */
class Employee {

	private int empID;
	private String empName;

	public Employee(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}

	public void employeeInformation() {
		System.out.println("Employee ID:" + empID);
		System.out.println("Employee Name:" + empName);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1111, "SCOTT");
		Employee e2 = new Employee(1112, "TIGER");
		e1.employeeInformation();
		e2.employeeInformation();
	}

}
