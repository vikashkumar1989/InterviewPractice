package test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait extends Base{
	
	@Test
	public void explicitwait() {
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys("NYC");
		driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='H-fromDate']")).sendKeys("01/31/2019");
		driver.findElement(By.xpath("//input[@id='H-toDate']")).sendKeys("02/08/2019");
		driver.findElement(By.xpath("//button[@id='H-searchButtonExt1']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,4);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'❮ Back to AlaskaAir.com')]")));
		String a=driver.findElement(By.xpath("//a[contains(text(),'❮ Back to AlaskaAir.com')]")).getText();
		if(a.contains("Back")) {
			driver.findElement(By.xpath("//a[contains(text(),'❮ Back to AlaskaAir.com')]")).click();
		}

		
	}
	

}
