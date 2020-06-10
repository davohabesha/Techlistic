package Com.Qa.Techlistic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TechlisiticTC extends Base{

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
	
	@Test (priority=1)
	public void GetUrl() {
		driver.get(url);
		String urlDadd= driver.getCurrentUrl();
		System.out.println(urlDadd);
	}
	@Test(priority=2)
	public void VerfySignIn() {
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("dawitadera1@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	}
	
	  @Test (priority=3)
	  
	  public void EnterPersonalINFO() {
	  driver.findElement(By.xpath("//input[@id= 'id_gender1']")).click();
	  driver.findElement(By.xpath("//*[@id=\"customer_firstname\"] ")).sendKeys(
	  "dave");
	  driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys(
	  "aderaw"); }
	 

}