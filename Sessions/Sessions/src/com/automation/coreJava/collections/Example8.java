package com.automation.coreJava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Employee {
	
	private int empID;
	private String empName;
	private String employeerName;
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmployeerName() {
		return employeerName;
	}

	public void setEmployeerName(String employeerName) {
		this.employeerName = employeerName;
	}
	
	public Employee(int empID,String empName,String employeerName){
		this.empID = empID;
		this.empName = empName;
		this.employeerName = employeerName;
	}
	
	public Employee(int empID,String empName){
		this.empID = empID;
		this.empName = empName;
		this.employeerName = "CTS";
	}
	
	public void displayEmpInfo(){
		System.out.println("Employee Details:" + empID + "\t" + empName + "\t"	+ employeerName);
	}

}

class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void displayStudentInfo() {
		System.out.println("Student Details:" + id + "\t" + name);
	}

}


class Example8 {

	public static void main(String[] args) {
		
		/*Create ArrayList object */
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1111, "RAMKI", "CTS");
		Employee e2 = new Employee(1112, "KIRAN", "CTS");
		Employee e3 = new Employee(1113, "SCOTT", "CTS");
		Employee e4 = new Employee(1114, "TIGER", "CTS");

		/* How to add objects to ArrayList */
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		System.out.println("Level 1:" + empList);
		
		empList.get(0).displayEmpInfo();
		empList.get(1).displayEmpInfo();
		empList.get(2).displayEmpInfo();
		empList.get(3).displayEmpInfo();

		/*Retrieve all objects from  ArrayList  using iterator*/
		Iterator<Employee> iterator = empList.iterator();
		while (iterator.hasNext()) {
			iterator.next().displayEmpInfo();
		}

		/*Retrieve all objects from  ArrayList  using ListIterator*/
		System.out.println("------------------>");
		ListIterator<Employee> listIterator = empList.listIterator();
		while (listIterator.hasNext()) {
			listIterator.next().displayEmpInfo();
		}
		
		/*Retrieve all objects from  ArrayList  using ListIterator*/
		System.out.println("<------------------");
		while (listIterator.hasPrevious()) {
			listIterator.previous().displayEmpInfo();
		}
	}

}
