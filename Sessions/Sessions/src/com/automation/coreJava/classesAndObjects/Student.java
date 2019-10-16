package com.automation.coreJava.classesAndObjects;

/* This example shows how to write class and create object */
class Student {

	private int id;
	private String name;
	private String courseName;
	private String email;
	private String mobileNumber;

	public void displayStudInfo() {
		System.out.print("Student ID:" + id + "\t");
		System.out.print("Student Name:" + name + "\t");
		System.out.print("Student Couse:" + courseName+ "\t");
		System.out.print("Student Email:" + email+ "\t");
		System.out.println("Student Mobile Number:" + mobileNumber + "\t");
	}

	public static void main(String args[]) {
		Student s0 = new Student();
		s0.displayStudInfo();
		Student s1 = new Student();
		s1.id = 1111;
		s1.name = "SCOTT";
		s1.courseName = "Selenium";
		s1.email = "scott@scott.com";
		s1.mobileNumber = "0123456789";
		s1.displayStudInfo();
		Student s2 = new Student();
		s2.id = 1112;
		s2.name = "TIGER";
		s2.courseName = "Java";
		s2.email = "tiger@tiger.com";
		s2.mobileNumber = "0123456799";
		s2.displayStudInfo();
		Student s3 = new Student();
		s3.id = 1113;
		s3.name = "TROY";
		s3.courseName = "C#";
		s3.email = "troy@troy.com";
		s3.mobileNumber = "0123456999";
		s3.displayStudInfo();
	}

}
