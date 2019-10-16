package windows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		String mainwindow = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		
		while (i1.hasNext()) {
			String childwindow =  i1.next();
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
				
				driver.switchTo().window(childwindow);
				
				driver.findElement(By.name("emailid")).sendKeys("prudhiviraju72@gmail.com");

				
				driver.findElement(By.name("btnLogin")).click();
				
			}
			
			
			driver.switchTo().window(mainwindow);
		}
		
		driver.close();
	}
	
}
