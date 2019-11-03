package notesprograms;

import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
		driver.get("https://www.facebook.com");
		WebElement e1 =driver.findElement(By.xpath("//*[@id=\"u_0_q\"]"));
		Actions act = new Actions(driver);
		act.sendKeys("prudhvi").perform();
		act.sendKeys(Keys.TAB).perform();
		WebElement e2 =driver.findElement(By.id("u_0_s"));
		act.sendKeys("prem").perform();
		act.sendKeys(Keys.TAB).perform();
		
		WebElement e3 =driver.findElement(By.xpath("//*[@id=\"u_0_v\"]"));
		act.sendKeys("8331900166").perform();
		act.sendKeys(Keys.TAB).perform();
		
		
		WebElement e4 =driver.findElement(By.xpath("//*[@id=\"u_0_12\"]"));
		act.sendKeys("8331900166").perform();
		act.sendKeys(Keys.TAB).perform();


		Thread.sleep(6000);
		((JavascriptExecutor)driver).executeScript("window.open('your url','_blank');");
		
		
		
		
	}
	
}
