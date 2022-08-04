package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGHardAssertions {

	
	@Test
	public void testHardAssertion() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\AutomationWorkspace\\JavaProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/login");

		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		
		Thread.sleep(10000);
		
		String expectedForgotPasswordPageTitle = "Reset Password | LinkedIn";
		
		String actualForgotPasswordPageTitle = driver.getTitle();
		
		Assert.assertEquals(actualForgotPasswordPageTitle, expectedForgotPasswordPageTitle);
		
		System.out.println("After first assertion..");
		
		
		WebElement emailTextField = driver.findElement(By.id("username"));
		
		WebElement resetPasswordBtn = driver.findElement(By.id("reset-password-submit-button"));
		
		Assert.assertTrue(emailTextField.isDisplayed());
		
		Assert.assertTrue(resetPasswordBtn.isDisplayed());
		
		
		driver.close();
		
	}
}