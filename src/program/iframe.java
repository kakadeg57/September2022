package program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Frames.html");
		//frame cha madhe janyasathi ha code
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("swara");
		//frame cha baher janyasathi ha code
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[contains(text(),'Practice Site')]")).click();
		
	}

}
