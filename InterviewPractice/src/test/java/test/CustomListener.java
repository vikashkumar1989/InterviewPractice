package test;

import java.io.File;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
public class CustomListener extends Base implements ITestListener, ISuiteListener{

public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	extent=new ExtentReports("C:\\Users\\Vikash\\Desktop\\Java\\InterviewPractice\\test-output",true,DisplayOrder.OLDEST_FIRST);
	extent.loadConfig(new File("C:\\Users\\Vikash\\Desktop\\Java\\InterviewPractice\\src\\main\\resources\\ReportsConfig.xml"));
	test=extent.startTest(result.getName());	
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onStart(ISuite suite) {
	// TODO Auto-generated method stub
	
}

public void onFinish(ISuite suite) {
	// TODO Auto-generated method stub
	
}
}