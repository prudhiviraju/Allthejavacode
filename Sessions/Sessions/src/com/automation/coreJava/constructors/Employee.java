package com.automation.coreJava.constructors;

/* This example shows how to create Constructor and Constructor Overloading */
class Employee {
	
	private int empID;
	private String empName;
	private double salary;
	private String mobileNumber;
	private String employeerName;

	public Employee(int empID, String empName,double salary,String mobileNumber) {
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
		employeerName = "TCS";
	}

	public Employee(int empID, String empName,double salary,String mobileNumber,String employeerName) {
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
		this.employeerName = employeerName;
	}

	public void displayEmpInfo() {
		System.out.print("Employee ID:" + empID + "\t");
		System.out.print("Employee Name:" + empName + "\t");
		System.out.print("Employee Salary:" + salary + "\t");
		System.out.print("Employee Mobile Number:" + mobileNumber + "\t");
		System.out.println("EmployeerName:" + employeerName);
	}

	public static void main(String args[]) {
		Employee e1 = new Employee(1111,"SCOTT",99999.99,"0123456789");
		Employee e2 = new Employee(1112,"TIGER",88888.99,"0123456788");
		Employee e3 = new Employee(1113,"RAMKI",99999.99,"0123456787","CTS");
		e1.displayEmpInfo();
		e2.displayEmpInfo();
		e3.displayEmpInfo();
	}

}
