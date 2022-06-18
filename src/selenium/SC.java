package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SC {
	
	
	public void Capture() throws IOException, InterruptedException {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		TakesScreenshot tcs=(TakesScreenshot) driver;
		
		File capture=tcs.getScreenshotAs(OutputType.FILE);
		
		File locator=new File(System.getProperty("user.dir") + "//Screenshot1//screen1.png");
		
		FileHandler.copy(capture, locator);
		
		System.out.println("Screenshot");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		SC ref=new SC();
		ref.Capture();
		

	}

}
