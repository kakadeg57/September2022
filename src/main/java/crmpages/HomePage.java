package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import crmbase.TestBase;
import utility.Util;

public class HomePage extends TestBase
{
	// page factory > initElements
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// web elements repo
	@FindBy (xpath = "//a[contains(text(),'Logout')]")
	WebElement logoutBtn;
	
	@FindBy (xpath = "//*[contains(text(),'User:')]")
	WebElement userLabel;
	
	@FindBy (xpath = "//a[@title='Companies']")
	WebElement companies;
	@FindBy (linkText = "New Company")
	WebElement newCompanyLink;
	
	@FindBy (xpath = "//a[@title='Contacts']")
	WebElement contacts;
	@FindBy (linkText = "New Contact")
	WebElement newContactLink;
	
	@FindBy(xpath = "//a[@title='Deals']")
	WebElement deal;
	@FindBy(xpath = "//a[text()='New Deal']")
	WebElement newDealLink;
	
	@FindBy(xpath = "//a[@title='Tasks']")
	WebElement task;
	@FindBy(xpath = "//a[@title='New Task']")
	WebElement newTaskLink;
	
	@FindBy(xpath = "//a[@title='Reports']")
	WebElement reports;
	
	// Action/method
	public void logout() 
	{
		Util.switchToMainPanelFrame();
		logoutBtn.click();
	}
	
	public boolean userName()
	{
		Util.switchToMainPanelFrame();
		return  userLabel.isDisplayed();
	}

	public NewCompanyPage clickOnCreateCompany() 
	{
		Util.switchToMainPanelFrame();
		Util.mouseHover(companies);	
		newCompanyLink.click();		
		return new NewCompanyPage();
	}
	public NewContactPage clickOnNewContact()
	{
		Util.switchToMainPanelFrame();
		Util.mouseHover(contacts);	
		newContactLink.click();
		return new NewContactPage();
	}
	public void clickOnNewDeal()
	{
		Util.switchToMainPanelFrame();
		Util.mouseHover(deal);
		newDealLink.click();
	}
	public void clickOnNewTask()
	{
		Util.switchToMainPanelFrame();
		Util.mouseHover(task);
	    newTaskLink.click();
		
	}
	
	public void clickOnReports()
	{
		Util.switchToMainPanelFrame();
		Util.ExplicitWait(reports, 25); // 50 implicit + 25 explicit
		reports.click();
	}
}
