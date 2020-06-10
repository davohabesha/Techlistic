package Com.Qa.Techlistic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/*
 * Steps to Automate:
1. Open this url  http://automationpractice.com/index.php
2. Click on sign in link.
3. Enter your email address in 'Create and account' section.
4. Click on Create an Account button.
5. Enter your Personal Information, Address and Contact info.
6. Click on Register button.
7. Validate that user is created.

 *  */

public class Base{
	
	public static WebDriver driver;
	public static String url= "http://automationpractice.com/index.php";
	
	@BeforeClass
	
	public void SetUp() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/mistreaderaw/Downloads/geckodriver");
		driver = new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}

	
/*@AfterClass
public void TearDown() {
	driver.close();
}*/

}
