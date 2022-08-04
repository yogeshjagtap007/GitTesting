package test;

import org.testng.annotations.Test;

public class TestNGDependentMethods {
	
	@Test
	public void launchFlipkart() {
		System.out.println("In launch flipkart method");
	}
	
	@Test(dependsOnMethods="launchFlipkart")
	public void loginToFlipkart() {
		System.out.println("In login to flipkart");
	}
	
	@Test(dependsOnMethods="loginToFlipkart")
	public void addToCart() {
		System.out.println("In add to cart..");
	}

}