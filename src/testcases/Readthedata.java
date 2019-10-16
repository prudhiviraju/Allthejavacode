package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.Property;

public class Readthedata {

	Property  pro;
	
	@Test
	public void read() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\freecrmtest\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(pro.url());
		driver.findElement(By.xpath("")).sendKeys(pro.username());
		driver.findElement(By.xpath("")).sendKeys(pro.password());
		driver.findElement(By.xpath("")).click();
		driver.quit();
		
		
		
		
		
		
		
		
		
	}
	
}
