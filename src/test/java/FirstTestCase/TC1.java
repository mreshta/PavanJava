package FirstTestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is after class...");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before every Method");

	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("This is after test method");
	}

	@Test
	public void test1() {

		System.err.println("This is test1...");
	}

	@Test
	public void test2() {
		System.out.println("This is test2...");
	}

}
