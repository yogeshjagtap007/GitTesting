package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGParalleExecution2 {

	@Test
	public void testFbLoginPage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\AutomationWorkspace\\JavaProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		WebElement emailAddressTextField = driver.findElement(By.id("email"));
		
		Assert.assertTrue(emailAddressTextField.isDisplayed());
		
		driver.close();
		
	}
}