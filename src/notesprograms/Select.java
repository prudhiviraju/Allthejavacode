package notesprograms;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		WebElement element =driver.findElement(By.xpath("//*[@id=\"day\"]"));
		
		org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(element);
		java.util.List<WebElement> opt =sel.getOptions();

		
		for(int i=0;i<=opt.size();i++) {
				System.out.println(opt.get(i).getText());
			
		}
		
		driver.quit();
	}
	
}
