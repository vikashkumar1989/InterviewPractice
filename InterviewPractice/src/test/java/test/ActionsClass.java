package test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ActionsClass extends Base{
	
	@Test
	public void SelectDropDOwn() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		WebElement signin=driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]"));;		
		WebElement order=driver.findElement(By.xpath("//span[contains(text(),'Your Orders')]"));
		a.moveToElement(signin).moveToElement(order).click().build().perform();
		driver.navigate().back();		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("condom").doubleClick().build().perform();
		WebElement signin2=driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]"));;
		a.moveToElement(signin2).contextClick().build().perform();
		
	
		
	}
	

}
