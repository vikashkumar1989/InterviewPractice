package test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AlertTest extends Base{
	
	@Test
	public void SelectDropDOwn() throws InterruptedException, IOException {
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File("D:\\scr.jpeg");
		FileUtils.copyFile(srcFile, destFile);
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		driver.switchTo().alert().accept();
	
		
	}
	

}
