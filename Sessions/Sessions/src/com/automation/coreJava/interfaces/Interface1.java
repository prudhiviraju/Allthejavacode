package com.automation.coreJava.interfaces;

/* This example shows How to declare Interface*/
interface Interface1 {

	void m1();
	
	abstract void m2();
	
	public void m3();
	
	public abstract void m4();
	
	/* if you uncomment below lines it will give error message */
	
	//private void m5();
	
	//protected void m7();
	
	//final void m8();
	
	/* From Java 1.8 version onwards we cann declare below methods*/
	
	default void m9(){
		System.out.println("This is Default method");
	}
	
	public static void m10(){
		System.out.println("This is static method");
	}
	

}
