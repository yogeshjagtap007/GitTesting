package test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	@Test(dataProvider="userCredentials")
	public void testUserLogin(String email, String password) {
		System.out.println("Email ==> " + email + "  Password ==> " + password);
	}
	
	

	@DataProvider(name = "userCredentials")
	public Object[][] getData() {

		return new Object[][] { { "admin@test.com", "Admin@123" }, { "support@test.com", "Support@123" },
				{ "consultant@test.com", "Consultant@123" } };
	}

}