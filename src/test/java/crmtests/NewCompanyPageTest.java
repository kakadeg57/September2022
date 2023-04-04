package crmtests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import crmbase.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;
import crmpages.NewCompanyPage;
import utility.ReadExcelData;

public class NewCompanyPageTest extends TestBase
{
	NewCompanyPage newCompanyPage;
	
	@BeforeMethod
	public void initialization()
	{
		init();
		LoginPage loginPage = new LoginPage();
		HomePage homePage = loginPage.login();
		newCompanyPage = homePage.clickOnCreateCompany();
	}
	@DataProvider(name="company")
	public String[][] sendData() 
	{
		return ReadExcelData.readCompanyData();
	}
	@Test(priority = 1, dataProvider = "company")
	public void validateCreateCompanyTest(String companyName,String empSize,String city,String country)
	{
		newCompanyPage.createCompany(companyName,empSize,city,country);
	}
		
	
	@Test(priority = 2)
	public void demo()
	{
		System.out.println("demo test");
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
	}
	
}
