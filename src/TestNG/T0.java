package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class T0{
	
	WebDriver driver;
	
	
	@BeforeClass
	public void Browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");	
		
		  
		  //String EXPt="Facebook";
		  //String ACTt=driver.getTitle();
		  
	}
	
	@Test (dataProvider="login Data")
	public void login(String user, String pass) throws IOException{
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(user);
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(pass);
		
		 driver.findElement(By.xpath("//button[@name='login']")).click();
		  
		
	}
	
	@DataProvider(name="login Data")
	public String[][] getData() throws IOException{
	
		//locate file
		String path=System.getProperty("user.dir")+"//Data.xlsx";
		
		//handle file
		File file=new File(path);
	
		//read file
		FileInputStream fis=new FileInputStream(file);
		
		//create workbook
		XSSFWorkbook ws=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=ws.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell=row.getCell(0);
		
		System.out.println(sheet.getRow(0).getCell(0));
		
		String username=sheet.getRow(1).getCell(0).getStringCellValue();
		
		String pass=sheet.getRow(1).getCell(1).getStringCellValue();
		
		String loginData[][]= {
				
				{username, pass}
		};
		
		return loginData;
		
		
}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		
		Thread.sleep(8000);
		driver.close();
	}
}

  
 