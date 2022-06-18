package datareader;

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

public class ExMee {
	
	
	public static String Read(int r, int c) throws IOException, InterruptedException {
		
		String path=System.getProperty("user.dir")+"\\DataW3.xlsx";
		
		File file=new File(path);
		
		FileInputStream source=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(source);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		String val=sheet.getRow(r).getCell(c).getStringCellValue();
		
		wb.close();
	
		
		return val;
		
		
		
	}
	
	
	public static void main(String[]args) throws IOException, InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		WebElement textbox=driver.findElement(By.xpath("//*[@id='username']"));
		
		WebElement passbox=driver.findElement(By.xpath("//*[@id='password']"));
		
		textbox.sendKeys(Read(0,0));

		passbox.sendKeys(Read(0,1));
		
		
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	
	}
	}