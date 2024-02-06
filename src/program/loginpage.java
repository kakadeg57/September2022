package program;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends testbase {
	public loginpage()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(name="username")
WebElement username;


@FindBy(name="password")
WebElement password;

@FindBy(xpath="//*[@value='Login']")
WebElement loginBtn;

public void login()
{
	username.sendKeys("speedway@2016");
	password.sendKeys("Speedway@2016");

	loginBtn.click();

}
}
