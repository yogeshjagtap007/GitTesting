package test;

import org.testng.annotations.Test;

public class TestNgGroups
{
	@Test(groups= {"ValidLogin","Regression","Smoke"})
	public void testValidLogin()
	{
		System.out.println("In valid login test method");
	}
	
	@Test(groups="InValidLogin")
	public void testInValidLogin()
	{
		System.out.println("In invalid test method");
	}
	
	@Test(groups="ValidLogin")
	public void testSupportUserLogin()
	{
		System.out.println("In Support user test method");
	}
}

