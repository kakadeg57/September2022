package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crmbase.TestBase;
import utility.Util;

public class NewTaskPage extends TestBase{
	
// web elements
	@FindBy(xpath = "//a[@title='Tasks']")
	WebElement taskLink;
	
	
// page factory
	public NewTaskPage() {
	   PageFactory.initElements(driver, this);	
	}
	
	 
// actions	
    public void clickTaskLink() {
    	Util.switchToMainPanelFrame();
    	Util.mouseHover(taskLink);
    }
	
	
	
}
