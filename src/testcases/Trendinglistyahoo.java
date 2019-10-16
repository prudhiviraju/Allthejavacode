package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trendinglistyahoo {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium\\\\Latest Drivers\\\\geckodriver-v0.25.0-win64\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://www.yahoo.com");
		
		Thread.sleep(5000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='applet_p_32209491']"));
		System.out.println(allLinks.size());
		
		for(WebElement wb :allLinks) {
			
			String linkname = wb.getText();
			System.out.println(linkname);
		}
		
		
		driver.quit();
	}
	

}
