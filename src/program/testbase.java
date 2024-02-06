package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase {
public static WebDriver driver;
public static void init() {
	


System.setProperty("webdriver.chrome.driver","C:\\Users\\Swaraj\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 driver = new ChromeDriver();

driver.get("https://classic.freecrm.com/index.html");
}
}