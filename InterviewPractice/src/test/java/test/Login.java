package test;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Login extends Base{
	@Test(dataProvider="getData")
	public void Login(String username, String password) {
		driver.get("http://www.way2automation.com/");
		driver.findElement(By.xpath("//a[contains(text(),'MEMBER LOGIN')]")).click();;
		Set<String> windows=driver.getWindowHandles();
		for(String w:windows) {
			driver.switchTo().window(w);
			String title=driver.getTitle();
			if(title.equals("Way2Automation")) {
				driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys(username);
				driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys(password);
				driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[3]/input")).click();
				
			}
		}
		for(String w:windows) {
			driver.switchTo().window(w);
			String title=driver.getTitle();
			if(title.contains("Best Selenium")) {
				driver.findElement(By.cssSelector("#navbar-collapse-1 > ul > li:nth-child(1) > a")).click();				
			}
		}

		
	}
	@DataProvider
	public Object[][] getData(){
		Object a[][]=new Object[1][2];
		a[0][0]="vikashk.101289@gmail.com";
		a[0][1]="lohani@123";
		return a;
	}

}
