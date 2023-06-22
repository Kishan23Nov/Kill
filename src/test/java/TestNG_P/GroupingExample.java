package TestNG_P;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups = {"Pattern1"})
	public void test_1() {
		System.out.println("This is test one");
	}

	
	@Test(groups = {"Pattern1"})
	public void test_2() {
		System.out.println("This is test two");
	}
	
	@Test(groups = {"Pattern2"})
	public void test_3() {
		System.out.println("This is test Three");
	}
	
	@Test(groups = {"Pattern2"})
	public void test_4() {
		System.out.println("This is test Four");
	}
	
	@Test(groups = {"Pattern1","Pattern2"})
	public void test_5() {
		System.out.println("This is test Five");
	}
}
