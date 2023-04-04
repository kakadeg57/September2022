package utility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import crmbase.TestBase;

public class Util extends TestBase
{
	
	public static void switchToMainPanelFrame()
	{
		driver.switchTo().frame("mainpanel");
	}
	
	
	public static void mouseHover(WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();	
	}
	
	public static void ExplicitWait(WebElement element, int waitTime)
	{
		WebDriverWait wait = new WebDriverWait(driver,waitTime);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
