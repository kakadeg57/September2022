package crmtests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crmbase.TestBase;
import crmpages.LoginPage;

public class LoginPageTest extends TestBase
{
  LoginPage loginPage ;
	
	@BeforeMethod
	public void initialization() 
	{
		init();
		loginPage = new LoginPage();
	}
	
	@Test
	public void validateLoginTest()
	{
		loginPage.login();
		
	}
	
	@Test
	public void validateLogoTest()
	{
		boolean status =loginPage.logoIsDisplayed();
		Assert.assertTrue(status); // it will expect always true value
	}
	@Test
	public void valdiateForgotPasswordLinkRedirection()
	{
	loginPage.forgotPassword();
	String forgotPasswordAttributeValue = driver.findElement(By.xpath("(//*[@type='submit'])[2]")).getAttribute("value");
	Assert.assertEquals(forgotPasswordAttributeValue, "Get Password");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
}
