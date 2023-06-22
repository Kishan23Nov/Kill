package TestNG_P;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondP {

	@Test
	 public void Setup() {
		  System.out.println("Krishna Gopal Soni_2");
	  }
	  
	  @Test
	  public void login() {
		  System.out.println("Login Page_2");
		  
	  }
	  
	  @Test
	  public void teardown() {
		  System.out.println("Closing the Browser_2");
		  //Assert.fail();
	  }
}
