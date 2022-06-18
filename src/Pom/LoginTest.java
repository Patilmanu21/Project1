package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest {
	
	WebDriver driver;
	LoginPage lp;
	
	@BeforeTest
	public void intBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@BeforeClass
	public void intObject() {
		
	  lp=new LoginPage(driver);
		
	}
	
	@Test(priority=1)
	public void verfiyButton() {
		
		System.out.println(lp.isButtonPresent());
		
		Assert.assertTrue(lp.isButtonPresent());
		
		
	}
	
	@Test(priority=2)
	public void login() {
		
		lp.login("Admin", "admin123");
		
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
	}
	
	@AfterTest() 
	public void teardown() {
		
		driver.close();
		
	}
	
	
}
