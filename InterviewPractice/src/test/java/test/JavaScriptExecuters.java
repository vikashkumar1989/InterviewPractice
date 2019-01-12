package test;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JavaScriptExecuters extends Base{
	
	@Test
	public void JavaScript() throws InterruptedException, IOException {
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BEN");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ENTER);
		System.out.println("Frome Place Name :"+driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String place=(String) js.executeScript("return document.getElementById('fromPlaceName').value");
		System.out.println("Frome Place Name :"+place);
		
		while(!place.equals("BENGALURU AIRPRT")) {
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
			place=(String) js.executeScript("return document.getElementById('fromPlaceName').value");
		}
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ENTER);


		
	
		
	}
	

}
