package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crmbase.TestBase;

public class LoginPage extends TestBase{

public LoginPage()
{
	PageFactory.initElements(driver, this);
}
	
// web elements repository 
	
	//driver.findElement(By.xpath(""));
	@FindBy  (name = "username") 
	WebElement userName;
	@FindBy (name = "password")
	WebElement password;
	@FindBy (xpath = "//*[@value='Login']")
	WebElement loginBtn;
	
	@FindBy (linkText = "Forgot Password?")
	WebElement forgotPasswordLink;
	
	@FindBy (xpath = "/html/body/div[2]/div/div[1]/a/img")
	WebElement logoImg;
	
// actions
	public HomePage login()
	{
		userName.sendKeys("speedway2016");
		password.sendKeys("speedway@2016");
		loginBtn.click();
		
		HomePage hp = new HomePage();
		return hp; 
		//return new HomePage();
	}
	
	public void forgotPassword()
	{
		forgotPasswordLink.click();
	}
	
	public boolean logoIsDisplayed() // true
	{
		boolean value = logoImg.isDisplayed();
		return value;
	}

}
