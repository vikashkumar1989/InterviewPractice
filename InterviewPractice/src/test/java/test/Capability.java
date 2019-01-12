package test;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Capability {
	WebDriver driver;
	@Test
	public void BrowserCap() {
		//depriciated
	/*	ProfilesIni prof=new ProfilesIni();
		FirefoxProfile fp=prof.getProfile("Selenium");
		fp.setAcceptUntrustedCertificates(true);
		fp.setAssumeUntrustedCertificateIssuer(true);
		driver=new FirefoxDriver();*/
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		ChromeOptions ch=new ChromeOptions();
		ch.merge(cap);
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(ch);
		driver.get("https://ksrtc.in/oprs-web/");
		driver.close();
		
/*		DesiredCapabilities cap2=DesiredCapabilities.firefox();
		//cap2.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap2.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	//	cap2.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		FirefoxOptions ch2=new FirefoxOptions();
		ch2.merge(cap2);
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		driver=new FirefoxDriver(ch2);
		driver.get("https://ksrtc.in/oprs-web/");
		driver.close();*/
		
		
/*		DesiredCapabilities cap3=DesiredCapabilities.internetExplorer();
		//cap3.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap3.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//cap3.setCapability(CapabilityType.BROWSER_NAME, "InternetExplorer");		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		InternetExplorerOptions ch3=new InternetExplorerOptions();
		ch3.merge(cap3);
		driver=new InternetExplorerDriver(ch3);
		driver.get("https://ksrtc.in/oprs-web/");
		driver.close();*/
		
		
	}

}
