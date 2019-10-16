package com.automation.coreJava.instanceMethods;

/* This Example is used to check whether the given number is even or odd */
class Example2 {

	private int startNumber;
	
	private int endNumber;
	
	public Example2(){
		startNumber = 1;
		endNumber = 100;
	}
	
	public Example2(int startNumber, int endNumber) {
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}
	
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
		Example2 test1 = new Example2();
		test1.checkEvenAndOdd();
		Example2 test2 = new Example2(200,300);
		test2.checkEvenAndOdd();
	}

}
