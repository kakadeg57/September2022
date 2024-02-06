package program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

driver.get("https://demo.automationtesting.in/Register.html");
driver.findElement(By.cssSelector("[placeholder=\"First Name\"]")).sendKeys("Swara");
driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]")).sendKeys("Swaraj");
driver.findElement(By.cssSelector("[ng-model=\"Adress\"]")).sendKeys("lagacyivy");
driver.findElement(By.cssSelector("[value=\"Male\"]")).click();
driver.findElement(By.cssSelector("[value=\"Adobe InDesign\"]")).click();
driver.findElement(By.cssSelector("[value=\"1997\"]")).click();
}
}