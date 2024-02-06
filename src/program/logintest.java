package program;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class logintest {
	WebDriver driver;
	Properties prop;
	@BeforeClass
	public void addtest()
	{
		System.out.println("add this test");
		
	}
   // @Parameters("url")
	@BeforeMethod
	
		public void initialization() throws IOException {
		prop = new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Swaraj\\eclipse-workspace\\javaprogram\\configuration.properties");
		prop.load(file);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Swaraj\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();

		driver.get(prop.getProperty("url"));
		}
    //@Parameters({"username","password"})
	@Test()
	
		public void loginpage() {
    	driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
    	driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
    	driver.findElement(By.cssSelector("[value='Login']")).click();
    	
			
		}
	}

