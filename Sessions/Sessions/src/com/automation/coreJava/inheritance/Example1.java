package com.automation.coreJava.inheritance;

/* This example shows how to implement inheritance(private,default,protected and public methods) concept*/
@SuppressWarnings("unused")
class Parent {

	private void m0() {
		System.out.println("private-parent-m0");
	}

	void m1() {
		System.out.println("default-parent-m1");
	}

	protected void m2() {
		System.out.println("protected-parent-m2");
	}

	public void m3() {
		System.out.println("public-parent-m3");
	}
	
	public static void m4(){
		System.out.println("public-static-parent-m4");
	}
	
	public final void m5(){
		System.out.println("public-final-parent-m5");
	}
}

class Child extends Parent{
	
	public void m6() {
		System.out.println("public-child-m6");
	}
	
}

class Example1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		p.m2();
		p.m3();
		Parent.m4();
		p.m5();
	
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		Child.m4();
		c.m5();
		c.m6();
		
		Parent parent = new Child();
		parent.m1();
		parent.m2();
		parent.m3();
		Parent.m4();
		parent.m5();
		/* if you uncomment the below line then it will give the error message */
		//parent.m6();
	}

}
