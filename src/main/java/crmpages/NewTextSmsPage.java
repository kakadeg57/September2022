package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crmbase.TestBase;
import utility.Util;

public class NewTextSmsPage extends TestBase {

	// web elements
		@FindBy(xpath = "//a[@title='Text/SMS']")
		WebElement textLink;
		
		
	// page factory
		public NewTextSmsPage() {
		   PageFactory.initElements(driver, this);	
		}
		
		 
	// actions	
	    public void clickTextLink() {
	    	Util.switchToMainPanelFrame();
	    	Util.mouseHover(textLink);
	    }
}
