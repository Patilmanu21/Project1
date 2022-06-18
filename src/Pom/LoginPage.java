package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(id="txtUsername")
	private WebElement usernameTextbox;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement passTextbox;
	
	@FindBy(css="input#btnLogin")
	private WebElement loginbutton;
	

	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public boolean isButtonPresent() {
		
		
		boolean stateOfButton=loginbutton.isDisplayed();
		
		
		
		return stateOfButton;	
	}
	
	public void login(String user, String pass) {
		
		usernameTextbox.sendKeys(user);
		
		passTextbox.sendKeys(pass);
		
		loginbutton.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
