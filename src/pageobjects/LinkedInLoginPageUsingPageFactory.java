package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInLoginPageUsingPageFactory {
 
	// Locators + functions
	
	WebDriver driver;
	
	@FindBy(id = "username")
	WebElement emailTextField;
	
	@FindBy(id="password")
	WebElement passwordTextField;
	
	public LinkedInLoginPageUsingPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailAddress(String email) {
		emailTextField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	
	
	public boolean isEmailTextFieldDisplayed() {
		return emailTextField.isDisplayed();
	}
	
}