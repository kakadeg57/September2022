package utility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import crmbase.TestBase;

public class Util extends TestBase
{
	static String pWin;
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

	public static void switchToChildWindow() {
		Util.pWin = driver.getWindowHandle();
		
		Set<String> cWin = driver.getWindowHandles();
		  for(String win : cWin) 
		  {
			  if(! Util.pWin.equals(cWin))
			  {
				  driver.switchTo().window(win);
			  }
		  }
		  
	}
		  
		
	public static void switchToParentWindow() {
			driver.switchTo().window(Util.pWin);
		}
}
