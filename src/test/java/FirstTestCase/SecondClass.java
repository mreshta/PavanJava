package FirstTestCase;

import org.testng.*;
import org.testng.annotations.Test;

public class SecondClass {

	@Test(priority = 1)
	void setup() {

		System.out.println("This is my setup");
		Assert.assertEquals(1, 2);
	}

	@Test(priority = 4)
	void searchCustomer() {
		System.out.println("Customer test");
	}

	@Test(priority = 5)
	void addCustomer() {
		System.out.println("Add customer test");

	}

	@Test(priority = 2)
	void login() {

		System.out.println("This is my login test");
	}

	@Test(priority = 3)
	void teardown() {
		System.out.println("This is tear down method");

	}
}
