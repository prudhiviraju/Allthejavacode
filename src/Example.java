import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract class Example {

	
	
	abstract public void loan();
	abstract void personalloan();
	abstract protected void homeloan();
	
	
	
	public void home() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin"
				+ "\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.hdfcbank.com");
		driver.quit();
		
	}
	
	
	
	
	
	
}
