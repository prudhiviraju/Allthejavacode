package windows;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowirctc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[contains(text(),'PROMOTIONS')]")).click();
		WebElement wb =driver.findElement(By.xpath("//li[@class='menu-list header-icon-menu']//ul[@class='box-shadow']//li//span[@class='list_text'][contains(text(),'IRCTC Tourism App')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(wb).click().perform();
		
		String mainwindow =driver.getWindowHandle();
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1= s1.iterator();
		
		while (i1.hasNext()) {
			String childwindow = i1.next();
			if (!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.findElement(By.id("q")).sendKeys("prudhiviraju72@gmail.com");
				
			}
				
		}	
		driver.switchTo().window(mainwindow);
		
		driver.quit();
		
		
		
		
	}
	
	
}
