package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedinLoginPage {

	// Locators + Functions

	// Instance variable
	WebDriver driver;

	public LinkedinLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void enterEmailAddress(String email) {
		driver.findElement(By.id("username")).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	public void clickOnSignInButton() {
		driver.findElement(By.id("signIn")).click();
	}
	
	public boolean isEmailTextFieldDisplayed() {
		return driver.findElement(By.id("username")).isDisplayed();
	}

}