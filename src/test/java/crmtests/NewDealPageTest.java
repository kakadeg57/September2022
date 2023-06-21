package crmtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crmbase.TestBase;
import crmpages.LoginPage;
import crmpages.NewDealPage;
import utility.Util;

public class NewDealPageTest extends TestBase{

	LoginPage loginPage ;
	NewDealPage dealsPage ;
	
	@BeforeMethod
	public void initialization() {
		init();
		loginPage = new LoginPage();
		dealsPage = new NewDealPage();
		
		loginPage.login();
		Util.switchToMainPanelFrame();
	}

	
	@Test
	public void validateDealsLink() {
		dealsPage.clickOnNewDealsLinks();
		dealsPage.sendData();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
