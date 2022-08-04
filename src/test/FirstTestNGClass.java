package test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGClass {

	@Test
	public void f() {
		System.out.println("In test method..");
		// Driverpath
		// Driver instance
		// driver.findelement

	}

	@Test
	public void invalidLogin() {
		System.out.println("In invalid login test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In before method..");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("In after method..");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("In before class...");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("In after class..");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("In before test..");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("In after test..");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In before suite..");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("In after suite..");
	}

}

