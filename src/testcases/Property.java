package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Property {

	
@Test	
public void reading() throws Exception {
	
File src = new File("C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\testcases\\config.property");
FileInputStream fis = new FileInputStream(src);
Properties pro = new Properties();
pro.load(fis);

String chrome = pro.getProperty("chromedriver");
System.out.println("the path is " + chrome);

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
driver.get(pro.getProperty("url"));
driver.findElement(By.id("username")).sendKeys(pro.getProperty("username"));

	
}
	
	
}
