package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class A {
	
	
	public void Alert() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement alertbt=driver.findElement(By.cssSelector("input[name='submit']"));
		alertbt.click();
		
		Alert alertwindow=driver.switchTo().alert();
		
		String msg=alertwindow.getText();
		
		System.out.println(msg);
		Thread.sleep(2000);
		
		alertwindow.accept();
		
	}

	public static void main(String[] args) throws InterruptedException {
	
		A ref=new A();
		ref.Alert();

	}

}
