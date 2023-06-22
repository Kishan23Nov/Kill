package TestNG_P;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency_Example {
	
	@Test
	public void startCar() {
		System.out.println("Start Car");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = {"startCar"} )
	public void driveCar() {
		System.out.println("Drive Car");
	}
	
	@Test(dependsOnMethods = {"driveCar"},alwaysRun = true)
	public void  stopCar() {
		System.out.println("Stop Car");
	}
	
	@Test(dependsOnMethods = {"stopCar"})
	public void parkCar() {
		System.out.println("Park the Car");
	}

}
