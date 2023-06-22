package TestNG_P;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	
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
	void test1() {
		System.out.println("This is test1");
	}
	@Test
	void test2() {
		System.out.println("This is test2");
	}
	
	

}
