package test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IsDisplayedEnabledSelected extends Base{
	
	@Test
	public void Method() {
		driver.get("https://www.makemytrip.com/");
		boolean a=driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed();
		System.out.println(a);
		driver.findElement(By.xpath("//label[@class='label_text flight-trip-type']")).click();
		boolean b=driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed();
		System.out.println(b);
		driver.findElement(By.xpath("//label[@class='label_text flight-trip-type']")).click();
		boolean c=driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isEnabled();
		System.out.println(c);
		int i=driver.findElements(By.xpath("//input[@id='hp-widget__return_01']")).size();
		if(i==0) {
			System.out.println("Not Present");
		}

		
	}
	

}
