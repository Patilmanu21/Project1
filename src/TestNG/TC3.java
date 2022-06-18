package TestNG;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(TestNG.ImpentatingClass.class)
public class TC3 {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	 public void intbrowser() throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		 
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(2000);
	 
	 }
		
  @Test
  public void verifyURL() {
	  
	  String actURL=driver.getCurrentUrl();
	  System.out.println(actURL);
	  String expURL="https://www.faceok.com/";
	  
	  
	  System.out.println("verify test case");
  }
  
  @Test
  public void verifyTitle() {
	  
	  String actTitle=driver.getTitle();
	  System.out.println(actTitle);
	  String expTitle="Facebook – log in sign up";
	  
	  SoftAssert sa=new SoftAssert();
	  sa.assertNotEquals(actTitle, expTitle);
	  
	  System.out.println("Soft Assert test case");
	  sa.assertAll();
	  
	  
	  
	    
  }
  
}
