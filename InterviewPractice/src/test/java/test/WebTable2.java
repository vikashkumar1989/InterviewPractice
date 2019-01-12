package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable2 extends Base{
	
	@Test
	public void table() {
		driver.get("file:///C:/Users/Vikash/Desktop/table.html");
		WebElement table=driver.findElement(By.xpath("/html"));
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int i=rows.size();
		for(int j=1;j<i;j++) {
			List<WebElement> cols=rows.get(j).findElements(By.tagName("th"));
			int k=cols.size();
			for(int l=0;l<k;l++) {
				System.out.println(cols.get(l).getText());
			}
		}
	}

}
