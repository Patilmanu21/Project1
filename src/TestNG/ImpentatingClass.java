package TestNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import selenium.Screenshot;

public class ImpentatingClass extends TC3 implements ITestListener{
	
	Screenshot var;

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("On Test Start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("On Test Success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("On Test Failure");
		
		var=new Screenshot();
		
		try {
			var.TakeScreenshot(driver,result.getName());
		} 
		catch (IOException | InterruptedException  e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("On Test Skipped");
		
	}

	
}
