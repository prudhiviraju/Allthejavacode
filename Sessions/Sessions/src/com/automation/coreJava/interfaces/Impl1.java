package com.automation.coreJava.interfaces;

class Impl1 implements Interface1 {

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	@Override
	public void m3() {
		System.out.println("m3");
		
	}

	@Override
	public void m4() {
		System.out.println("m4");
	}
	
	public static void main(String[] args) {
		
		/* if you uncomment below lines it will give error message */
		
		//Interface1 interface1 = new Interface1();
		
		Interface1 interface1 = new Impl1();
		
		interface1.m1();
		
		Impl1 impl1 = new Impl1();
		
		impl1.m1();

	}

}
