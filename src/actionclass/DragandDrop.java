package actionclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	
	public static void main(String[] args) {
		
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users"
				+ "\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement drag =driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		js.executeScript("arguments[0].scrollIntoView();", drag);
		
		
		try {
			File file =drag.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\testcases\\screenshotimages\\image2.png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	
		
		
		WebElement drop =driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		
		Actions act = new Actions(driver);
		
		try {
	Thread.sleep(5000);
	act.dragAndDrop(drag, drop);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		
	
		
		driver.quit();
		
	}
	
}
