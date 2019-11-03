package notesprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertyfile {

	static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
	
		
		Logger logger=Logger.getLogger("Propertyfile");
		PropertyConfigurator.configure("log4j.properties");
		
		
				
		
		logger.info("connecting the propertyfile");
		File file = new File("C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\testcases\\src\\notesprograms\\propertyfiles");
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);
		
		
		logger.info("opening the browser");
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\Latest Drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		
		
		
		String baseurl=pro.getProperty("url");
		
		logger.info("using property file loading the data");
		driver.get(baseurl);
		driver.findElement(By.name("firstname")).sendKeys(pro.getProperty("firstname"));
		driver.findElement(By.name("lastname")).sendKeys(pro.getProperty("lastname"));
		
	
		logger.info("taing the screenshot");
		File files =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(files, new File("./Screenshotimages/fuckyou1.png"));
		
		
		
		
		
		logger.info("close the browser");
		driver.quit();
		
		
		
		
		
	}
	
	
}
