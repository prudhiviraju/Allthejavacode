package testng;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example2 {

	private static String baseurl="https://www.icicibank.com";
	private static String chromevalue="C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe";
	private static WebDriver driver;
	private static String title ="Personal Banking, Online Banking Services - ICICI Bank";
	private static String privatetitle ="ICICI Bank Private Banking";
	
	@BeforeTest
	public void launchbrowser() {
		
		

		System.setProperty("webdriver.chrome.driver", chromevalue);
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--Disable-notifications");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(baseurl);
	}
	
	
	@Test(priority = 0)
	public void pagetitle() throws InterruptedException {
		
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle,title);
		System.out.println(acttitle);
		
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void privatebanking() {
		
		driver.findElement(By.linkText("Private")).click();
		String privateact =driver.getTitle();
		System.out.println(privateact);
	}
	
	
	

    @AfterTest
	public void teardown() {
		
		driver.quit();
	}
		
	
	
	
}
