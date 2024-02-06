package program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtowindow {

	private static final Collection<? extends String> WindowHandles = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		
		Set<String>Handles=driver.getWindowHandles();
		List <String> handles=new ArrayList<String>();
		Handles.addAll(WindowHandles);
		
		driver.close();
		driver.switchTo().window(handles.get(0));
		driver.close();
		
	}

}
