package program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("speedway2016");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("Speedway@2016");
		driver.findElement(By.cssSelector("[value='Login']")).click();
driver.switchTo().frame("mainpanel");
driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
}
}