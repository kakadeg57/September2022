package program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		Set<String>windowHandles=driver.getWindowHandles();
		System.out.println("windowHandles");
	
		Iterator<String>iterator=windowHandles.iterator();
		String ParenWindow=iterator.next();
		String childWindow=iterator.next();
		driver.switchTo().window(childWindow);
		driver.get("https://www.facebook.com/");
	}

}
