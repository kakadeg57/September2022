package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement drag=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='box101']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
	}

}
