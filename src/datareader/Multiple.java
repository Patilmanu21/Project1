package datareader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multiple {
	
	
	
	 public static String readData() throws IOException {
		 
		 //locate file
		 String path=System.getProperty("user.dir")+"\\Multiple.xlsx";
		 
		 //handle file
		 File file=new File(path);
		 
		 //read file
		 FileInputStream fis=new FileInputStream(file);
		 
		 //create workbook
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 
		 //create sheet
		 XSSFSheet sheet=wb.getSheet("Sheet1");
		 
		 //create row
		 XSSFRow row=sheet.getRow(0);
		 
		 //create cell
		 XSSFCell cell=row.getCell(0);
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 return null;
		  
		 
		 
	 }

	public static void main(String[] args) {
		
		
		
		


	}

}
