package FirstTestCase;

import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority=0)
	public void test1() {
		
		System.out.println("This is test1...");
	}
	@Test(enabled=true)
	public void test4() {
		System.out.println("This is test4...");
	}
	
	@Test(priority=-1)
	public void test2() {
		System.out.println("This is test2...");
	}
	@Test(priority=-3)
	public void test3() {
		System.out.println("This is test3...");
	}
	
}
