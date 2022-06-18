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

public class ExFB {
	
	
	public static String FB1(int r, int c) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\FB.xlsx";
		
		File file=new File(path);
		
		FileInputStream jsd=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(jsd);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		String val=sheet.getRow(r).getCell(c).getStringCellValue();
		
		wb.close();
		return val;
		
		
		
		
	}
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement textbox=driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement passbox=driver.findElement(By.xpath("//input[@id='pass']"));
		
		WebElement log=driver.findElement(By.xpath("//button[@name='login']"));
		
		textbox.sendKeys(FB1(0,0));
		
		passbox.sendKeys(FB1(0,1));
		
		log.click();
		
		Thread.sleep(8000);
		
		driver.close();
		

	}


	

}
