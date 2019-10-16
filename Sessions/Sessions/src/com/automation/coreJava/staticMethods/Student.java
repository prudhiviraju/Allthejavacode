package com.automation.coreJava.staticMethods;

/* Example to show how to use static variable */
class Student {

	private int studentID;
	private String studentName;
	private static int counter;

	public Student() {
		counter++;
		System.out.println(counter + " Object Created");
	}

	public Student(int studentID, String studentName) {
		counter++;
		System.out.println(counter + " Object Created");
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public void displayStudInfo() {
		System.out.print("Student ID:" + studentID + "\t");
		System.out.println("Student Name:" + studentName);
	}

	public static void main(String args[]) {
		Student s1 = new Student();
		s1.displayStudInfo();
		Student s2 = new Student();
		s2.displayStudInfo();
		Student s3 = new Student(1111, "SCOTT");
		s3.displayStudInfo();
		Student s4 = new Student(1112, "TIGER");
		s4.displayStudInfo();

	}

}
