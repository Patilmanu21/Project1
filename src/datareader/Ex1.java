package datareader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	
	  public static String dataread(int r, int c) throws IOException {
		  
		  //locate file
		  String path=System.getProperty("user.dir")+"\\FB.xlsx";
		  
		  //handle file
		  File handle=new File(path);
		  
		  //read file
		  FileInputStream fis=new FileInputStream(handle);
		  
		  //create workbook
		  XSSFWorkbook wb=new XSSFWorkbook(fis);
		  
		  //locate sheet
		  XSSFSheet sheet=wb.getSheet("Sheet1");
		  
		  //read cell value
		 String val= sheet.getRow(r).getCell(c).getStringCellValue();
		  
		  //close the file after read
		 wb.close();
		 
		 return val;  
		  
	  }
	
	
	public static void main(String[] args) throws IOException, InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement textbox=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		WebElement passbox=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		
		WebElement log=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		
		textbox.sendKeys(dataread(0,0));
		
		passbox.sendKeys(dataread(0,1));
		
		log.click();
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
