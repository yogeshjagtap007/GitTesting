package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.LinkedInLoginPageUsingPageFactory;

public class LinkedInLoginTestUsingPageFactory {
	
	@Test
	public void testLinkedInLoginUsingPagefactory() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\AutomationWorkspace\\JavaProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/login");

		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		LinkedInLoginPageUsingPageFactory loginPageUsingPageFactory = new LinkedInLoginPageUsingPageFactory(driver);
		
		loginPageUsingPageFactory.enterEmailAddress("vishal.sudrik@gmail.com");
		
		loginPageUsingPageFactory.enterPassword("Test@12345");
		
		Assert.assertTrue(loginPageUsingPageFactory.isEmailTextFieldDisplayed());
		
		driver.close();
	}
	
	@Test(dataProvider= "xyz")
	public void testLinkedInLoginUsingPagefactoryUsingdataprovider(String email, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\AutomationWorkspace\\JavaProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/login");

		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		LinkedInLoginPageUsingPageFactory loginPageUsingPageFactory = new LinkedInLoginPageUsingPageFactory(driver);
		
		loginPageUsingPageFactory.enterEmailAddress(email);
		
		loginPageUsingPageFactory.enterPassword(password);
		
		Assert.assertTrue(loginPageUsingPageFactory.isEmailTextFieldDisplayed());
		
		driver.close();
	}


}