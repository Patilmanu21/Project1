package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC1 {
	
	   WebDriver driver;
	   @Parameters("browser")
	   @BeforeTest
	
	
	public void intiBrowser(String type) {
		   
		   if(type.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		   }
		   
		   else {
			   
			   if(type.equals("firefox")) {
				   
				   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kirti\\Desktop\\Firefox64\\geckodriver.exe");
					
					 driver=new FirefoxDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://vctcpune.com/selenium/practice.html");   
				   
			   }
		   }	
	}
	   
	   @Test
	   public void verifyTitle() {
		   
		   String actTitle=driver.getTitle();
		   System.out.println(actTitle);
		   String expTitle="Practice Page";
		   
		   Assert.assertEquals(actTitle, expTitle);
		   
		   
	   }
	   
	   @AfterTest
	   public void tearDown() {
		   
		   driver.close();
	   }
  
}
