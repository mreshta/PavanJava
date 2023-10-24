package FirstTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

	@Test
	public void startCar() {
		System.out.println("Car started ");

	}

	@Test(dependsOnMethods = {"startCar"})
	public void driveCar() {

		System.out.println("Driving car ");
	}

	@Test(dependsOnMethods = {"driveCar"})
	public void stopCar() {
		System.out.println("Car stoped ");
		Assert.fail();
	}

	@Test(dependsOnMethods = {"stopCar", "driveCar"}, alwaysRun=true)
	public void parkCar() {

		System.out.println("Car parked ");
	}
}
