package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement a= driver.findElement(By.cssSelector("[placeholder=\"Month\"]"));
		Select sel = new Select(a);
		sel.selectByIndex(1);
		sel.selectByValue("January");
		sel.selectByValue("April");
	}

}