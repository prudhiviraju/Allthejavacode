package com.automation.coreJava.instanceMethods;

/* This Example is used to check whether the given number is even or odd */
class Example1 {

	private int startNumber = 1;
	
	private int endNumber = 100;
	
	public void checkEvenAndOdd(){
				
		while(startNumber!=endNumber){
			if (startNumber % 2 == 0) {
				System.out.println("Given Number '" + startNumber + "' is an even number" + "\t");
			} else {
				System.out.print("Given Number '" + startNumber + "' is an add number" + "\t");
			}
			startNumber++;
		}

	}

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.checkEvenAndOdd();
		
	}

}
