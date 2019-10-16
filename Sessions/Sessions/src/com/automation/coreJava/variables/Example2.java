package com.automation.coreJava.variables;

/* This example shows how to declare primitive data types and non primitive(Reference type) data types*/
class Example2 {

	public static void main(String[] args) {

		/* Primitive Data types*/
		int empID = 1199;

		double empSalary = 75000;
		
		char empGender = 'M';
		
		boolean isItContinue = false;
		
		System.out.println("EMPID:"+empID);
		
		System.out.println("EMPSALARY:"+empSalary);
		
		System.out.println("EMPGENDER:"+empGender);
		
		System.out.println("ISITContinue:" + isItContinue);
		
		/*auto boxing */
		Integer objEmpID = empID;
		
		Double objEmpSalary = empSalary;
		
		Character objEmpGender = empGender;
		
		Boolean objIsItContinue = isItContinue;
		
		System.out.println("EMPID:"+objEmpID);
		
		System.out.println("EMPSALARY:"+objEmpSalary);
		
		System.out.println("EMPGENDER:"+objEmpGender);
		
		System.out.println("ISITContinue:" + objIsItContinue);
		
		/* unboxing */
		
		empID = objEmpID;
		
		empSalary = objEmpSalary;
		
		empGender = objEmpGender;

		System.out.println("EMPID:"+empID);
		
		System.out.println("EMPSALARY:"+empSalary);
		
		System.out.println("EMPGENDER:"+empGender);
	}

}
