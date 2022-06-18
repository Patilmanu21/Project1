package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclss {
	
	
	public static void Select() throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirti\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://demoqa.com/select-menu");
	    
	      WebElement textbox=driver.findElement(By.id("oldSelectMenu"));
	    
	       Select sel=new Select(textbox);
	    
	      List<WebElement>dropvalues=sel.getOptions();
	      
	      for(WebElement ele:dropvalues) {
	    	  
	    	  String val=ele.getText();
	    	  
	    	  if (val.equalsIgnoreCase("Voilet")) {
	    		  
	    		  
	    		  ele.click();
	    	  }
	    	  
	    	  
	    	  
	    	  
	      }
	    
	    Thread.sleep(2000);
	    
	    
	}

	public static void main(String[] args) throws InterruptedException {
        
		Select();
	}

}
