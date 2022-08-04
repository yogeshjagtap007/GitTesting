package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGClass1 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Before class method");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("In after class method");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before test method");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("After test method");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Before suit method");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("After suit method");
  }

}
