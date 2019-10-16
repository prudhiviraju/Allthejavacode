package com.automation.coreJava.constructors;

/* This example shows how to create Constructor and Constructor Overloading  */
class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String course;
	private String mobileNumber;

	public Student(int id, String firstName,String lastName,String course,String mobileNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.mobileNumber = mobileNumber;
	}
	
	public void displayStudInfo() {
		System.out.print("Student ID:" + id + "\t");
		System.out.print("Student Name:" + firstName + " " + lastName + "\t");
		System.out.print("Student Couse" + course + "\t");
		System.out.println("Student MobileNumber" + mobileNumber + "\t");
	}

	public static void displayStudInfo(Student student) {
		System.out.print("Student ID:" + student.id + "\t");
		System.out.print("Student Name:" + student.firstName + " " + student.lastName + "\t");
		System.out.print("Student Couse" + student.course + "\t");
		System.out.println("Student MobileNumber" + student.mobileNumber + "\t");
	}

	public static void main(String args[]) {
		Student s1 = new Student(1111,"SCOTT","TIGER","UFT","0123456789");
		s1.displayStudInfo();
		Student s2 = new Student(1112,"JOHN","TROY","SELENIUM","0123456788");
		s2.displayStudInfo();
		Student s3 = new Student(1112,"SAI","KIRAN","RFT","0123456788");
		Student.displayStudInfo(s3);
		
	}

}
