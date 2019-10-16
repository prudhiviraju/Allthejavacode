package com.automation.coreJava.variables;

/* Example to shows how to declare array */
class Example5 {

	public static void main(String args[]) {

		int[] empID = new int[5];

		String[] empName = new String[5];

		System.out.println(empID.length);

		empID[0] = 1111;

		empID[1] = 1112;

		empID[2] = 1113;

		empID[3] = 1114;

		empID[4] = 1115;

		System.out.println(empID[0]);

		System.out.println(empID[1]);

		System.out.println(empID[2]);

		System.out.println(empID[3]);

		System.out.println(empID[4]);

		System.out.println(empName.length);

		empName[0] = "SCOTT";

		empName[1] = "TIGER";

		empName[2] = "KIRAN";

		empName[3] = "RAJESH";

		empName[4] = "RAMKI";

		for (int index = 0; index < empName.length; index++) {
			System.out.print(empName[index] + "\t");
		}
		
		System.out.println();
		
		for (String emp : empName) {
			System.out.print(emp + "\t");
		}

	}

}
