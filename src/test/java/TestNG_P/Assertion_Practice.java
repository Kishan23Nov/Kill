package TestNG_P;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion_Practice {
	 
	WebDriver driver;

	@BeforeClass
  void setup() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/");	
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
 }
	@Test
	void checkLogo() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Krishna");
		Thread.sleep(3000);
		//Assert.assertTrue(logo.isDisplayed(),"Logo is notdisplayed in page");
		
	}
}
