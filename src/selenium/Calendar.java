package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	
	
	public void Handle() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		WebElement frame=driver.findElement(By.xpath("//input[@id='datepicker1']"));
		
		frame.click();
		
	
		while(true) {
			
			String month=driver.findElement(By.xpath("\\div[@id='ui-datepicker-div']")).getText();
			
			if(!month.equalsIgnoreCase("June 2023")) {
				
				driver.findElement(By.xpath("\\a[@title='Next']")).click();
			}
			
			else {
				
				break;
			}
			
			
			driver.findElement(By.xpath("\\table[@class='ui-datepicker-calendar']\\tbody\\tr\\td\\a[text()='10']")).click();
			
			
			Thread.sleep(2000);
			
			driver.close();
			
		
			
		}
			
	}

	public static void main(String[] args) throws InterruptedException {
		
		Calendar var=new Calendar();
		var.Handle();
		
	}

}
