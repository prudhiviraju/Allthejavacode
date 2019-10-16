package com.automation.coreJava.polymorphism.compileTimePloymorphism;

/* This example shows how to create Constructor and method Overloading */
class Student {

	private int studentID;
	private String studentName;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public void displayStudInfo() {
		System.out.print("Student ID:" + studentID + "\t");
		System.out.print("Student Name:" + studentName + "\t");
	}

	public void displayStudInfo(Student student) {
		System.out.print("Student ID:" + student.studentID + "\t");
		System.out.println("Student Name:" + student.studentName);
	}

	public static void main(String args[]) {
		Student s1 = new Student(1111,"SCOTT");
		s1.displayStudInfo();
		Student s2 = new Student(1112,"TIGER");
		s2.displayStudInfo();
		Student s3 = new Student(1113, "RAMKI");
		s3.displayStudInfo(s3);
		Student s4 = new Student(1114, "KIRAN");
		s3.displayStudInfo(s4);
	}
}
