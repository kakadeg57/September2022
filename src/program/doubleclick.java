package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub;
				System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();

				driver.get("https://demoqa.com/buttons");
				WebElement button=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
				Actions act = new Actions (driver);
				act.doubleClick(button).perform();
	}

}
