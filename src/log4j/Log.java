package log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log {

	
	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger("Log");
		PropertyConfigurator.configure("log4j.properties");
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		logger.info("chrome opened");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		logger.info("maximize the window");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		logger.info("opened the guru page");
		
		 js.executeScript("window.scrollBy(0,2000)");
		 logger.info("scrolling the webpage");
		 driver.close();
	
	}
	
}
