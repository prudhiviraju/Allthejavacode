package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	
	
	public static void main(String[] args) {
       String baseurl ="https://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(baseurl);
		
		WebElement day =driver.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByValue("20");
		
        WebElement month=driver.findElement(By.id("month"));
		Select selm = new Select(month);
		selm.selectByValue("6");
		
        WebElement year=driver.findElement(By.id("year"));
		Select sely = new Select(year);
		sely.selectByVisibleText("1993");
		
		driver.close();
		
	}
}
