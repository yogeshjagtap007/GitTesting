package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {

	@Test
	@Parameters("browser")
	public void testParameter(String browser) {
		System.out.println("Browser name " + browser);
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		}else {
			// Firefox
			// Driver creation logic
		}
		
		// driver.get("");
	}
}
