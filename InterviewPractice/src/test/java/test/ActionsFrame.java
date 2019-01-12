package test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ActionsFrame extends Base{
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		int i=driver.findElements(By.tagName("iframe")).size();
		
		for(int j=0;j<i;j++) {
			driver.switchTo().frame(j);
			if(driver.findElements(By.xpath("//*[@id='draggable']")).size()>0) {
				WebElement source=driver.findElement(By.xpath("//*[@id='draggable']"));
				WebElement target=driver.findElement(By.xpath("//*[@id='droppable']"));
				Actions a=new Actions(driver);
				a.dragAndDrop(source, target).build().perform();
				driver.switchTo().defaultContent();
				break;
				
				
			}
			
		}
		
		int k=driver.findElements(By.tagName("a")).size();
		System.out.println("Number of Links :"+k);
		
		


		
	
		
	}
	

}
