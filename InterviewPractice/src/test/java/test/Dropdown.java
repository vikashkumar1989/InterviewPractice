package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends Base{
	
	@Test
	public void SelectDropDOwn() {
		driver.get("http://www.spicejet.com/");
		WebElement select=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s=new Select(select);
		s.selectByIndex(0);
		s.selectByValue("AED");
		s.selectByVisibleText("INR");
	}
	

}
