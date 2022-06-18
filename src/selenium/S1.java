package selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {

	public void calendar() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,700)");
		
		String first=driver.getWindowHandle();
		
		WebElement box=driver.findElement(By.id("opentab"));
		box.click();
		
		
		Set<String> com=driver.getWindowHandles();
		
		for(String abc:com) {
			
			if(!abc.equals(first)) {
				
				driver.switchTo().window(abc);
				String title=driver.getTitle();
				System.out.println(title);	
			}	
		}
		
		driver.switchTo().window(first);
		String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(8000);
		driver.quit();	
	
	}
	
	public static void main(String[]args) throws InterruptedException {
		
		S1 var1=new S1();
		var1.calendar();	
    	
    }
}