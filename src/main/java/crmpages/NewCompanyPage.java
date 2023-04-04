package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crmbase.TestBase;

public class NewCompanyPage extends TestBase
{
	
	// page factory
	public NewCompanyPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// elements repo
	@FindBy(id = "company_name")
	WebElement compnayName;
	@FindBy(id = "num_of_employees")
	WebElement nrOfEmp;
	@FindBy(name = "address")
	WebElement address;
	@FindBy(name = "country")
	WebElement country;
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[8]/td/input")
	WebElement saveBtn;
	
// xpath axes	
	//ancestor
	//preceding-sibling
	//preceding
	//parent
	
	//child
	//following
	//following-sibling
	//descendant
	
	
	public void createCompany(String companyName, String empSize, String city,String Country)
	{
		compnayName.sendKeys(companyName);
		nrOfEmp.sendKeys(empSize);
		address.sendKeys(city);
		country.sendKeys(Country);
		saveBtn.click();
		
	}
	
}
