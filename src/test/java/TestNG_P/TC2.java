package TestNG_P;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2 {
	
	@BeforeClass
	void beforeClass() {
		System.out.println("Before executing class's actual Methods");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("After executing class's actual Methods");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("Before every Test Method");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("After every Test Method");
	}
	
	@Test
	void Test3() {
		System.out.println("This is Test 3");
	}
	
	@Test
	void Test4() {
		System.out.println("This is Test 4");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("This is before starting any class");
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("This is after completing all Class");
	}
	

}
