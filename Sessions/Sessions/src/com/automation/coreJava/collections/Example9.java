package com.automation.coreJava.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Example9 {

	public static void main(String[] args) {

		/*Create ArrayList object */
		ArrayList<Object> list = new ArrayList<Object>();

		/*Create Employee Object */
		Employee e1 = new Employee(1111, "RAMKI", "CTS");
		Employee e2 = new Employee(1112, "KIRAN", "CTS");
		Employee e3 = new Employee(1113, "SCOTT", "CTS");
		Employee e4 = new Employee(1114, "TIGER", "CTS");

		/*Create Student Object */
		Student s1 = new Student(100, "SCOTT");
		Student s2 = new Student(101, "TIGER");
		Student s3 = new Student(103, "DAVID");

		/* Add objects to ArrayList */
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println(list);

		/*Retrieve all objects from  ArrayList  using iterator*/
		Iterator<Object> iterator = list.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			if (obj instanceof Employee) {
				((Employee) obj).displayEmpInfo();
			} else if (obj instanceof Student) {
				((Student) obj).displayStudentInfo();
			}
		}
	}
}
