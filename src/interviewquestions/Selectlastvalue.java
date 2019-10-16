package interviewquestions;

import java.awt.List;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectlastvalue {

	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\Lates"
				+ "t Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com"); 	 	
	
		
		WebElement element= driver.findElement(By.id("day"));
	
		Select sel = new Select(element);
		java.util.List<WebElement> e = sel.getOptions();
		System.out.println(e.size());
		int selint=sel.getOptions().size();
		System.out.println(selint);
		sel.selectByIndex(selint-1);
		
		
	}
	
}
