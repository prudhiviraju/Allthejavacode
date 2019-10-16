package com.automation.coreJava.instanceMethods;

/* instance vs static variable*/
class Test {

	int instanceVariable = 1;
	static int staticVariable = 1;
	
	public void getValue() {
		System.out.println("Instance Variable value is :" + instanceVariable);
		System.out.println("Static Variable value is :" + staticVariable);
	}
	
	public static void main(String[] args) {
		Test obj1 = new Test();
		Test obj2 = new Test();
		obj1.getValue();
		obj1.instanceVariable = obj1.instanceVariable+1;
		Test.staticVariable = Test.staticVariable+1;
		obj1.getValue();
		obj2.getValue();
		
	}

}
