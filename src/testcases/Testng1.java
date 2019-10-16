package testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {

	
	@BeforeSuite
	public void base() {
		
		System.out.println("beforesuite");
		
	}
	
	
	@BeforeTest
	public void launchbrowser() {
		System.out.println("beforetest");
		
	}
	
	@BeforeClass
	public void credentials() {
		
		System.out.println("beforeclass");
		
	}
	
	@BeforeMethod
	public void screenshot() {
		
		System.out.println("beforemethod");
	}
	
	@Test
	public void main() {
		System.out.println("test");
		
	}
	
	@AfterMethod
	public void clearing() {
		
		System.out.println("aftermethod");
	}
	
	@AfterClass
	public void reenter() {
		
		System.out.println("afterclass");
	}
	
	@AfterTest
	public void clear() {
		System.out.println("aftertest");
		
	}
	
	@AfterSuite
	public void teardown() {
		
		
		System.out.println("aftersuite");
	}
	
	
	
}
