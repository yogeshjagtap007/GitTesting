package test;

import org.testng.annotations.Test;

public class TestNgGroups2 {

	@Test(groups="InValidLogin")
	public void testInValidLogin() {
		System.out.println("In invalid login test method from testnggroups class 2");
	}
	
	@Test(groups="ValidLogin")
	public void testSupportUserLogin() {
		System.out.println("In support user test method testnggroups class 2");
	}
}