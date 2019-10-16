package com.automation.coreJava.accessModifiers;

/* This example shows visibility of access modifiers */
class Example1 {
	
	public static void main(String args[]) {
		Test test = new Test();
		/* if you uncomment the below line then it will give the error message */
		//System.out.println(test.privateVariable);
		System.out.println(test.defaultVariable);
		System.out.println(test.protectedVariable);
		System.out.println(test.publicVariable);
		/* if you uncomment the below line then it will give the error message */
		//test.m1();
		test.m2();
		test.m3();
		test.m4();
	}

}
