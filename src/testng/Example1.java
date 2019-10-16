package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example1 {

	
	private String baseurl ="https://www.hdfcbank.com";
	private String chromevalue="C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe";
	private WebDriver driver;
	private String expected="HDFC Bank: Personal Banking Services";
	private String expectedtitile ="Customer Digital Journey";
	
	@BeforeTest
	public void launchbrowser() {
		
			
			System.setProperty("webdriver.chrome.driver", chromevalue);
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get(baseurl);
		
		
	}
	
	@Test(priority = 0)
	public void verifypagetitle() {
		
	String actual=driver.getTitle();
	
	Assert.assertEquals(actual, expected);
		
	}
	

	@Test(priority = 1)
	public void applynow() throws InterruptedException {
		
		
		
		WebElement element =driver.findElement(By.xpath("//span[contains(text(),'Apply now')]"));
		element.click();
		Thread.sleep(5000);
		
		
		String parentid=driver.getWindowHandle();
		System.out.println("the parent id is " + parentid);
		
		int total =driver.getWindowHandles().size();
		System.out.println("the total no of windows are" + total);
		
		WebElement element1 =driver.findElement(By.xpath("//a[@class='mainlink'][contains(text(),'Personal Loan')]"));
		Actions action = new Actions(driver);
		action.moveToElement(element1).perform();
		Thread.sleep(5000);
		String acttitle =driver.getTitle();
		
		Assert.assertEquals(expectedtitile, acttitle);
	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
	
}
