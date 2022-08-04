package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.LinkedinLoginPage;

public class LinkedInLoginTestUsingPageObject {
	
	@Test
	public void testLinkedInLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\AutomationWorkspace\\JavaProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/login");

		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		LinkedinLoginPage linkedinLoginPage = new LinkedinLoginPage(driver);
		
		linkedinLoginPage.enterEmailAddress("vishal.sudrik");
		
		linkedinLoginPage.enterPassword("Test@1234");
		
		Assert.assertTrue(linkedinLoginPage.isEmailTextFieldDisplayed());
		
		
		driver.close();
	}

}