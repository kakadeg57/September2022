package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crmbase.TestBase;
import utility.Util;

public class NewCallPage extends TestBase{
	
	// web elements
	
		@FindBy(xpath = "//*[text()='Mail Accounts']")
		WebElement newCallLink;
		
		

	// page factory	 
		public NewCallPage() {
			PageFactory.initElements(driver, this);
		}

		
		
	// actions
		
		public void clickEmailLink() {
			Util.switchToMainPanelFrame();
			Util.mouseHover(newCallLink);
		}
		
	

}
