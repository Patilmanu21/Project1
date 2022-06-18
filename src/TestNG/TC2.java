package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC2 {
	
	WebDriver driver;
	
	@BeforeTest
	public void browser() {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		//step-1 Launch browser
	   driver=new ChromeDriver();
		
		//Step-2 Maximize window
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://www.facebook.com/");	
		
	}
		
  @Test(dataProvider="testData")
  public void login(String user, String pass) throws InterruptedException, IOException {
	  
	  WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	  username.sendKeys(readData(0,0));
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(readData(0,1 ));
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	  Thread.sleep(2000);
	  
	  driver.navigate().back();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//input[@id='email']")).clear();
  }
  
  @DataProvider(name="testData")
  public String readData(int r,int c) throws IOException {
	  
	  String path= System.getProperty("user.dir")+"//Data.xlsx";
		
		//step 2- File class to handle file
		File file =new File(path);
		
		//step-3 Read file via input straem
		FileInputStream fis=new FileInputStream(file);
		
		//step-4 Use poi classes to read data -create Work book object
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//step- 5 locate sheet
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		//step-6 read cell value
		String val=sheet.getRow(r).getCell(c).getStringCellValue();
		
		//step-7 close file after read
		wb.close();
		
		return val;
		
	}
	  
	 
  
  @AfterTest
  public void down() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  
	  driver.close();
  }
}
