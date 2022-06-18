package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class W1 {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		//step-1 Launch browser
		WebDriver driver=new ChromeDriver();
		
		//Step-2 Maximize window
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");//parent window
		String parentwin= driver.getWindowHandle();
		String parenturl=driver.getCurrentUrl();
		
	//open chiledwindows
		driver.findElement(By.xpath("//*[@id=\'social-icons\']/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\'social-icons\']/a[3]/img")).click();
		driver.findElement(By.xpath("//*[@id=\'social-icons\']/a[4]/img")).click();
		
	Set<String> windlist=driver.getWindowHandles();
	// covert set into list 
	List<String> wind=new ArrayList( windlist);
		
	for(String winid:wind) {
		 String url=driver.switchTo().window(winid).getCurrentUrl();
		 if(url.contains("facebook")) {
			 driver.switchTo().window(winid);
		 }
		 else if(url.contains(parenturl)) {
			 driver.switchTo().window(winid);
		 }
			
		 else {
			 //driver.close();
		 }
	}
	//driver.quit();
	
	}


	}


