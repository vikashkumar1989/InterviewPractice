package test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base {
	public static WebDriver driver;
	ExtentReports extent;
	ExtentTest test;

	@BeforeMethod
	public synchronized void  IntializeBrowser() {
		//test.log(LogStatus.INFO, "Initilize");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public synchronized void CloseBrowser() {
		if(driver!=null) {
			driver.quit();
		test.log(LogStatus.INFO, "Closed");
		extent.endTest(test);
		extent.flush();
		extent.close();
		
		}
		
	}
	
}
