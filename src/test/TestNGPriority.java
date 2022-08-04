package test;
import org.testng.annotations.Test;

public class TestNGPriority {
	
	@Test(priority=-1)
	public void test2() {
		
		System.out.println("In test 2 method");
	}
	
	@Test(priority=-2)
	public void test1() {
		
		System.out.println("In test 1 method");
	}
	
	@Test(priority=1)
	public void test3() {
		
		System.out.println("In test 3 method");
	}

}