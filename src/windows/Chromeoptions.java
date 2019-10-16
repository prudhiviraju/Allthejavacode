package windows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chromeoptions {
	
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver",
			        "C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");

			        ChromeOptions options = new ChromeOptions();
			        options.addArguments("window-size=2000,2000");

			        DesiredCapabilities cap = DesiredCapabilities.chrome();
			        cap.setCapability(ChromeOptions.CAPABILITY, options);

			        //this will open chrome with set size
			      
					WebDriver driver = new ChromeDriver(cap);
					driver.manage().deleteAllCookies();
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

			        driver.get("http://demo.guru99.com/test/delete_customer.php");
			        driver.findElement(By.name("cusid")).sendKeys("25445");
			        driver.findElement(By.name("submit")).click();
			        Alert alr= driver.switchTo().alert();
			        String alertmessage =driver.switchTo().alert().getText();
			        System.out.println(alertmessage);
			        
			        Thread.sleep(5000);
			        alr.accept();
			        
			        
			       
			        
			        
			        driver.close();
		
	}
	

}
