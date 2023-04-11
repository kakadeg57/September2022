package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crmbase.TestBase;
import utility.Util;

public class EmailPage extends TestBase{
	
// web elements
	
	@FindBy(xpath = "//a[text()='Email']")
	WebElement emailLink;
	
	

// page factory	 
	public EmailPage() {
		PageFactory.initElements(driver, this);
	}

	
	
// actions
	
	public void clickEmailLink() {
		Util.switchToMainPanelFrame();
		Util.mouseHover(emailLink);
	}
	
}
