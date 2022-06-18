package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	
	public void handleCal() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		//step-4 find out wheter it part of frame
				WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				
				//step-5 switch to frame
				driver.switchTo().frame(frame1);
				//step-6 click on calender button
				WebElement cal=driver.findElement(By.xpath("//input[@id='datepicker']"));
				cal.click();
				
				//step-7 handle calender-find out month year
				while(true) {
					
					String month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
					
					if (!month.equalsIgnoreCase("March 2020")) {
					driver.findElement(By.xpath("//a[@title='Prev']")).click();
						
					} else {
						
						break;
					}
					
				}
				
				//step-8 select date-
				
				driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='10']")).click();
				
	        }

		
		public static void main(String[] args) {
			P1 ref=new P1();
			ref.handleCal();

		}

}
