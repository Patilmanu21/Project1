package selenium;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	
	
	public void multiple() throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		String url="https://www.google.com/";
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,700)");
		
		String parentwindow=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(url);
		
		Set<String>setOfTab=driver.getWindowHandles();
		
		for(String set:setOfTab) {
			
			System.out.println(set);
			
			if(set.equals(parentwindow)) {
				
				driver.switchTo().window(parentwindow);
				String tab=driver.getTitle();
                System.out.println(tab);				
				
			}
			
			
		}
		
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Windows ref=new Windows();
		ref.multiple();

	}

}
