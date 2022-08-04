package test;

import org.testng.annotations.Test;

public class TestNGDependentgroups {
	
	@Test(groups="Smoke1")
	public void test4() {
		System.out.println("In test 4 method..");
	}
	
	@Test(groups="Regression1", dependsOnGroups="Smoke1")
	public void test6() {
		System.out.println("In test 6 method");
	}
	
	@Test(groups="Smoke1")
	public void test5() {
		System.out.println("In test 5 method");
	}

}
