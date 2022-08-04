package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest2
{
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\AutomationWorkspace\\JavaProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		driver.close();
		

	}
}
