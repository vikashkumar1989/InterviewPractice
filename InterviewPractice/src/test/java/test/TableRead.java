package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableRead extends Base{
	
	@Test
	public void TableRead() {
	
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/19160/rsa-vs-ind-1st-odi-india-tour-of-south-africa-2017-18");
		WebElement table=driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")).get(0);
		int rowcount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();	
		int score = 0;
		int extra = 0;
		for(int i=0;i<rowcount-3;i++) {
		String scr=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		score=score+Integer.parseInt(scr);
		}
		String extr=table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		extra=extra+Integer.parseInt(extr);
		String tot=table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int total=Integer.parseInt(tot);
		int totalscore=score+extra;
		System.out.println("Calculated Total Score :"+totalscore);
		System.out.println("Frm WbPage Total Score :"+total);
		if(total==totalscore) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
