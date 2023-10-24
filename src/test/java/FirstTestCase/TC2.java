package FirstTestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will execute beforesuite");
		
	}
	
	@AfterSuite
	public void afterSuite(){
		
		System.out.println("This will execute aftersuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test ...");
	
	}
	@AfterTest
	public void afterTest() {
		
		System.out.println("This is after test ...");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is after class");
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
	public void test3() {

		System.err.println("This is test3...");
	}

	@Test
	public void test4() {
		System.out.println("This is test4...");
	}
}
