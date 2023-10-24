package FirstTestCase;

import org.testng.*;
import org.testng.annotations.Test;

public class FirstClass {

	@Test(priority=1)
	void setup() {
		
		System.out.println("This is my setup");
		
	}
	@Test(priority =2)
	void login() {
		
		System.out.println("This is my login test");
	}
	
	@Test(priority=3)
	void teardown() {
		System.out.println("This is tear down method");
		
	}
}
