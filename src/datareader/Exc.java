package datareader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exc {
	
	
	  
	   public static void Datareader(int r, int c, String val) throws IOException {
		   
		   String path=System.getProperty("user.dir")+"//DataW3.xlsx";
		   
		   File source=new File(path);
		   
		   FileInputStream stream=new FileInputStream(source);
		   
		   XSSFWorkbook wb=new XSSFWorkbook(stream);
		   
		   XSSFSheet sheet=wb.getSheet("Sheet1");
		   
		   XSSFRow row=sheet.createRow(r);
		   
		   XSSFCell cell=row.createCell(c);
		   
		   cell.setCellValue(val);
		   
		   FileOutputStream output=new FileOutputStream(source);
		   
		   wb.write(output);
		   
		   wb.close();   
	   }
	

	 public static void main(String[]args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			List<WebElement>data=driver.findElements(By.xpath("//*[@id='customers']//tbody//tr//td[3]"));
			
			int row=0;
			int col=0;
			
			for(WebElement ele:data) {
				
				         String abc= ele.getText();
				         System.out.println(abc);
				         Datareader(row, col, abc);
				         row++;
					
			}
		
		
		             driver.close();
		
	}
	}