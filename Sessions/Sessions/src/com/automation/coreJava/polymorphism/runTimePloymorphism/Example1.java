package com.automation.coreJava.polymorphism.runTimePloymorphism;

import java.io.FileNotFoundException;

/* This example shows how to implement overriding(default,protected and public methods) concept*/
class Parent {

	void m1(){
		System.out.println("default-parent-m1");
	}
	
	protected void m2(){
		System.out.println("protected-parent-m2");
	}
	
	public Object m3(){
		System.out.println("public-parent-m3");
		return null;
	}
	
	public static void m4(){
		System.out.println("public-static-parent-m4");
	}
	
	public final void m5(){
		System.out.println("public-final-parent-m5");
	}
	
	public void m6() throws Exception{
		System.out.println("public-parent-throws exception-m6");
	}
}

class Child extends Parent {

	/* We can increase the scope of modifier */ 
	public void m1(){
		System.out.println("public-child-m1");
	}
	
	/* We cannot decrease the scope of modifier */
	/*if you uncomment the below lines of code then it will give the error message */
	/*void m2(){
		System.out.println("default-child-m2");
	}*/
	
	protected void m2(){
		System.out.println("protected-child-m2");
	}
	
	public String m3(){
		System.out.println("public-child-m3");
		return null;
	}
	
	public static void m4(){
		System.out.println("public-static - child-m4");
	}
	
	/*if you uncomment the below lines of code then it will give the error message */
	/*public final void m5(){
		System.out.println("public-final-child-m5");
	}*/
	
	public void m6() throws FileNotFoundException{
		System.out.println("public-child-throws exception-m6");
	}
	
	public void m7(){
		System.out.println("public-child-m7");
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
		c.m7();
		
		Parent parent = new Child();
		parent.m1();
		parent.m2();
		parent.m3();
		Parent.m4();
		parent.m5();
		
	}

}
