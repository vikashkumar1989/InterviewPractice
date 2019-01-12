package test;

import java.io.IOException;

import org.openqa.selenium.os.WindowsUtils;
import org.testng.annotations.Test;

public class ProcessKill {
	

	@Test
	public void method() {
		try {
			Runtime.getRuntime().exec("TASKKILL /F /IM excel.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
