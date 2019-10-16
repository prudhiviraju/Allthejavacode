package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createcustverif {

static 	String user = "prudhiviraju73@gmail.com";
static 	String pwd = "YpasUMER";
static  String url = "https://online.actitime.com/civicon/login.do";
static String desc = "practice session . to know how to create new customer";
			
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium\\\\Latest Drivers\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		
		Thread.sleep(5000);
		
		//click on cust link
		
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']")).sendKeys("prudhivi");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(desc);
		driver.findElement(By.xpath("//div[contains(text(),'Create Customer')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@class,'itemsContainer')]//div[2]//div[4]")).click();
		driver.findElement(By.xpath("//div[@class='actionButtonWrapper pressed']//div[@class='actionButton']")).click();
		driver.findElement(By.xpath("//div[@class='taskManagement_customerPanel']//div[@class='title'][contains(text(),'Delete')]")).click();
		
WebElement act =driver.findElement(By.xpath("//span[contains(text(),'Warning: Customer deletion cannot be undone.')]"));
	System.out.println(act.getText());	
		
	String exp ="Warning: Customer deletion cannot be undone.";
	if(exp.equals(act)) {
		System.out.println("Program is correct");
	}else {
		System.out.println("program is not correct");
	}
	
	driver.quit();
	
	}
	
}
