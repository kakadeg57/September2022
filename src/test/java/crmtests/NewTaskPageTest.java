package crmtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crmbase.TestBase;
import crmpages.LoginPage;
import crmpages.NewTaskPage;

public class NewTaskPageTest extends TestBase{
	
	NewTaskPage taskPage;
	
	@BeforeMethod
	public void initilization(){
		init();
		LoginPage loginPage = new LoginPage();
		loginPage.login();
		taskPage = new NewTaskPage();
	}
	
	@Test
	public void validateclickTextLink() {
		taskPage.clickTaskLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}
