package program;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Stopwatch Watch=null;
		
		try {
			Watch=Stopwatch.createStarted();
		
			driver.findElement(By.linkText("START ")).click();
			
		}
		catch(Exception e)
		{
			Watch.stop();
			System.out.println(e);
			System.out.println(Watch.elapsed(TimeUnit.SECONDS)+"Seconds");
		}
		
		
	}

	}

