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

public class Ex5 {
	
	
	public static void write(int r,int c, String val) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\Data2.xlsx";
		
		File file=new File(path);
		
		FileInputStream fsc=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fsc);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		XSSFRow row=sheet.createRow(r);
		
		XSSFCell cell=row.createCell(c);
		
		cell.setCellValue(val);
		
		FileOutputStream sdc=new FileOutputStream(file);
		
		wb.write(sdc);
		
		wb.close();	
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,800)");
		
		List<WebElement>data=driver.findElements(By.xpath("//*[@id='product']//tbody"));
		
		int row=0;
		int col=0;
		int i=0;
		
		for(WebElement abc:data) {
			
			        String val=abc.getText();
					    System.out.println(val);
					    write(row,col, val);
					row++;
			    		
			    }
			    
			    
		
		driver.close();
		

	}

}
			