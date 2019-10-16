package com.automation.coreJava.ultimate;

/* final keyword at variable level,uncomment 12'th line then it will give error message */
class Example1 {

	private final double PI = 3.14;

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		System.out.println(example1.PI);
		/* if you uncomment below line then it will give error message */
		//example1.PI = 3.15;

	}

}
