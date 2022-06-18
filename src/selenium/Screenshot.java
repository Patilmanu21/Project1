package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	static WebDriver driver;
	static String result;
	
	
	
	public void TakeScreenshot(WebDriver driver, String name) throws IOException, InterruptedException {
		
		TakesScreenshot tc=(TakesScreenshot) driver;
		
		   File capture= tc.getScreenshotAs(OutputType.FILE);
		   
		   File locate=new File(System.getProperty("user.dir") + "\\Screenshot1\\"+name+".png");
			 
			
		  
		  FileHandler.copy(capture, locate);
		  
		  System.out.println("Capture Screenshot");
		
		
		
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
        Screenshot var=new Screenshot();
        
        var.TakeScreenshot(driver,result);
      		
	}

	public void TakeScreenshot1(WebDriver driver2, String name) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}