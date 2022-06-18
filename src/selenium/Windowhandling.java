package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windowhandling {
	
	
	public static void main(String[] args)  {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");
		
		String parentTab=driver.getWindowHandle();
		String parenturl=driver.getCurrentUrl();
		
		//child window
		driver.findElement(By.xpath("\\*[@id=\'social-icons\']/a[1]/img")).click();
		driver.findElement(By.xpath("\\*[@id=\'social-icons\']/a[2]/img")).click();
		driver.findElement(By.xpath("\\*[@id=\'social-icons\']/a[3]/img")).click();
		driver.findElement(By.xpath("\\*[@id=\'social-icons\']/a[4]/img")).click();
		
		//*[@id="Seperate"]/button
		
		 Set<String> windowlist=driver.getWindowHandles();
		
		 List<String>wind=new ArrayList(windowlist);
		 
		for(String sel:wind) {
			
			String s1=driver.switchTo().window(sel).getCurrentUrl();
			
			if(s1.contains("facebook")) {
				
				
				driver.switchTo().window(s1);
			}
			
			else if(s1.contains(parentTab)) {
				
				 driver.switchTo().window(s1);
					
			}
			
			else {
				
				driver.close();
			}
				
		}
		
		}
	
        
	

}
