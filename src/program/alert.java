package program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//alert
	driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]")).click();
	driver.switchTo().alert().accept();
	
	//conformation
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		//prompt
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		driver.switchTo().alert().sendKeys("swara");
		driver.switchTo().alert().accept();
		
	}

}
