package test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RadioButton extends Base{
	
	@Test
	public void RadioButton() throws InterruptedException {
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		List<WebElement> element=driver.findElements(By.xpath("//input[@name=\"group1\"]"));
		for(WebElement e:element) {
			if(e.getAttribute("value").equals("Cheese")) {
				if(!e.isSelected()) {
					e.click();
					Thread.sleep(5000);
					break;
					
				}
			}
		}
		
	}
	

}
