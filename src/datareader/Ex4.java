package datareader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex4 {

	
	  public static void writeData(int r,int c, String val) throws IOException {
		  
		  String path=System.getProperty("user.dir")+"//Data4.xlsx";
		  
		  File dest=new File(path);
		  
		  FileInputStream fsd=new FileInputStream(dest);
		  
		  XSSFWorkbook wb=new XSSFWorkbook(fsd);
		  
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		XSSFRow row=sheet.createRow(r);
		
		XSSFCell cell=row.createCell(c);
		
		cell.setCellValue(val);
		
		FileOutputStream com=new FileOutputStream(dest);
		wb.write(com);
		
		wb.close();
		
	   
		  
	  }
	
	
	public static void main(String[] args) throws IOException {
		

		for(int i=0; i<=4; i++) {
			
			
			String[]ar= {"Pune","Aurangabad","Nashik","Kolhapur","Mumbai"};
		     writeData(i,0, ar[i]);
		}
		}
	}


