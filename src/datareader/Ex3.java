package datareader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {

	  static String convert;
	
	public static String readData(int r, int c) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\Data.xlsx";
		
		File source=new File(path);
		
		FileInputStream fs=new FileInputStream(source);
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(r);
		
		XSSFCell cell=row.getCell(c);
		
		switch(cell.getCellType()) {
		
		case STRING:convert=cell.getStringCellValue();
		break;
			
			
		case NUMERIC:System.out.println(cell.getNumericCellValue());
		convert=String.valueOf(cell);
		break;
		
		}
		
		wb.close();
		
		return convert;	
	}
	
       public static void main(String[] args) throws InterruptedException, IOException {
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement textbox=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		WebElement passbox=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		
		WebElement log=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		
		textbox.sendKeys(readData(0,0));
		
		passbox.sendKeys(readData(0,1));
		
		log.click();
		
		Thread.sleep(2000);
		
		driver.close();
		

	}




	
}
