package crmtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crmbase.TestBase;
import crmpages.LoginPage;
import crmpages.NewTextSmsPage;

public class NewTextSmsPageTest extends TestBase{

   NewTextSmsPage textSmsPage;
	
	@BeforeMethod
	public void initilization(){
		init();
		LoginPage loginPage = new LoginPage();
		loginPage.login();
		textSmsPage = new NewTextSmsPage();
	}
	
	@Test
	public void validateclickTextLink() {
		textSmsPage.clickTextLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
