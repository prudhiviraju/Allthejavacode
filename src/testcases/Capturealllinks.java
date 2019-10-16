package testcases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturealllinks {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium\\\\Latest Drivers\\\\geckodriver-v0.25.0-win64\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://www.amazon.in/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

    Thread.sleep(5000);		
	System.out.println(allLinks.size());	

		
	for(int i=0;i<allLinks.size();i++) {
		String linkname =allLinks.get(i).getText();
		System.out.println(linkname);
		
	}
	
	driver.quit();
	
	}
	

}
