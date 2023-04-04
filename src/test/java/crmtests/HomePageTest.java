package crmtests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import crmbase.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;
import utility.Util;

public class HomePageTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	

	@BeforeMethod
	public void initialization()
	{
		init();
		loginPage = new LoginPage();
		homePage = loginPage.login();
	
	}
	
	@Test(priority = 1)
	public void validateLogoutTest() // pre-requisite 
	{
		
		homePage.logout();
		Assert.assertTrue(loginPage.logoIsDisplayed()); // validation
	
	}
	
	@Test(priority = 2)
	public void validateUsernameTest()
	{   
		boolean status = homePage.userName();
		Assert.assertTrue(status); // validation
	}

	@Test(priority = 3)
	public void validate_create_company_Link_RedirectionTest()
	{   
		homePage.clickOnCreateCompany();
		// validation
	}
	
	@Test (priority = 4)
	public void validate_Create_Contact_Link_RedirectionTest()
	{   
		homePage.clickOnNewContact();
		// validation
	}
	
	@Test (priority = 5)
	public void validate_Deal_Link_RedirectionTest()
	{  
		homePage.clickOnNewDeal();
		// validation
	}
	
	@Test (priority = 6)
	public void validate_Task_Link_RedirectionTest()
	{   
		
		homePage.clickOnNewTask();
		// validation
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
}
