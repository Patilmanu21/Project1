package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alter {
	
	public void alterhandling() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,700)");
		
		WebElement alertbutton=driver.findElement(By.cssSelector("input#alertbtn"));
		alertbutton.click();
		
		Alert alertwindow=driver.switchTo().alert();
		
		String msg=alertwindow.getText();
		
		System.out.println(msg);
		Thread.sleep(8000);
		
		alertwindow.accept();
		
		String name="Teachers";
		
	  driver.findElement(By.cssSelector("input#name")).sendKeys(name);
		
	  Thread.sleep(4000);
	  
	  driver.findElement(By.cssSelector("input#confirmbtn")).click();
	  
	  Alert confirm=driver.switchTo().alert();
	  
	  
	  String actualmsg=confirm.getText();
	  
	  System.out.println(actualmsg);
	  Thread.sleep(5000);
	  
	  if(actualmsg.contains("parent")) {
		  
		  System.out.println("Test cases passed");
		  confirm.accept();
		    
	  }
	  
	  else {
		  
		  System.out.println("Test cases failed");
		  confirm.dismiss();
	  }
		
		
		
		driver.close();
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Alter var=new Alter();
		var.alterhandling();
	}

}
