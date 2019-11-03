package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	
	/**
	 * the test is started
here intentionally failed the test

the number 2 program is started

Again the soft assertion using
here we passed
 
again hard assertion
the hard assertion is used

PASSED: loan
PASSED: homeloan
PASSED: studentloan
FAILED: personal
	 */
	
	
	/**
	 * //Assertion is Class , Assertions are two types Soft assert and hard assert, 
	 * hard asserts are static method and soft is non static
	 * Assertion are used for verify expected result and as per the automation rule for expected result we should have to use the 
	 * assertion...if else block dosent have the capability to fail the testng testcases,when the test is getting failed
	
	 */
	
	@Test(priority = 0)
	public void loan() {
		
		
		System.out.println("the test is started");
		SoftAssert softa = new SoftAssert();
		softa.assertEquals(true, false);
		
		System.out.println("here intentionally failed the test");
		
	}
	
	@Test(priority = 1)
	public void personal() {
		
		System.out.println("the number 2 program is started");
		Assert.assertEquals(true ,false);
		
		System.out.println("here also intentionally the test is failed");
		
	}
	
	@Test(priority = 2)
	public void homeloan() {
		
		System.out.println("Again the soft assertion using");
		
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(true, true);
		System.out.println("here we passed ");
		
		
	}
	
	@Test(priority = 3)
	public void studentloan() {
		
		System.out.println("again hard assertion");
		
		Assert.assertEquals(true, true);
		
		System.out.println("the hard assertion is used");
	}
	
	
}
