package TestNG_P;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority = 0)
	void TestOne() {
		System.out.println("This is Test_One");
	}
	
	@Test(priority = 1)
	void TestTwo() {
		System.out.println("This is Test_Two");
	}
	
	@Test(priority = 2,enabled = false)
	void TestThree() {
		System.out.println("This is Test_Three");
	}
	
	@Test(priority = 4 )
	void TestFour() {
		System.out.println("This is Test_Four");
	}

}
