package TestNG_P;
import org.testng.annotations.Test;

public class FirstP {
  @Test
  public void Setup() {
	  System.out.println("Krishna Gopal Soni");
  }
  
  @Test
  public void login() {
	  System.out.println("Login Page");
	  
  }
  
  @Test
  public void teardown() {
	  System.out.println("Closing the Browser");
  }
}
