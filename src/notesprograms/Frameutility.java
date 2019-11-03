package notesprograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frameutility {

WebDriver driver;
	
	public List< String > textValues(By locator) {
		
		  List<WebElement> elements = driver.findElements(locator);

		  List< String > values = new ArrayList<>();

		  for (WebElement e : elements)
		    values.add(e.getText());

		  return values;
		}	
	
}
