package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crmbase.TestBase;
import utility.Util;

public class NewDealPage extends TestBase {

	// page Factory	
		public NewDealPage() {
			PageFactory.initElements(driver, this);
		}

	// web elements
		
	  @FindBy(xpath = "//a[text()='Deals']")
	  WebElement deals;
	  
	  @FindBy(xpath = "//a[text()='New Deal']")
	  WebElement newDeals;
	  
	  @FindBy(id = "title")
	  WebElement title;
	  
	  // company Lookup
	  @FindBy(xpath = "(//*[@value= 'Lookup'])[1]")
	  WebElement comLookup;
	  
	  @FindBy(name = "search")
	  WebElement lookSearch;
	  
	  @FindBy(css = "[type = 'submit']")
	  WebElement lookSearchBtn;
	  
	  @FindBy(xpath = "//a[text()='Infosys']")     // search 'inf'
	  WebElement lookValue;
	  //--
	  
	  // primary contact Lookup
	  @FindBy(xpath = "(//*[@value= 'Lookup'])[2]")
	  WebElement priLookup;
	  
	  @FindBy(name = "search")
	  WebElement priLookSearch;
	  
	  @FindBy(css = "[type = 'submit']")
	  WebElement priLookSearchBtn;
	  
	  @FindBy(xpath = "//a[text()='sunisha Gujarathi']")  // search 'abi'
	  WebElement priLookValue;
	  //---
	  
	  @FindBy(xpath = "//td[@align='left']/descendant::input[@name='amount']")
	  WebElement amount;
	  
	  
	  
	  
	  
	// Actions
	  
	  public void clickOnNewDealsLinks() {
		  Util.mouseHover(deals);
		  newDeals.click();
	  }
	  
	  public void sendData() {
		  title.sendKeys("Sjhhajj");
		  
		  comLookup.click();
		  Util.switchToChildWindow();
		  lookSearch.sendKeys("inf");
		  lookSearchBtn.click();
		  lookValue.click();
		  Util.switchToParentWindow();
		  Util.switchToMainPanelFrame();
		  
		  priLookup.click();
		  Util.switchToChildWindow();
		  priLookSearch.sendKeys("sunisha");
		  priLookSearchBtn.click();
		  priLookValue.click();
		  Util.switchToParentWindow();
		  Util.switchToMainPanelFrame();
		  
		  amount.sendKeys("228826");
		  
		  
		  
		  
	  }
	
}
