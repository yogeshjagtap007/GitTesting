package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter2 {

	@Test
	@Parameters("browser")
	public void testParameterBrowser(String browser) {
		System.out.println("Browser name ==> "  + browser);
	}
}