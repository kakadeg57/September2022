package crmbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.implementation.bytecode.Duplication;

public class TestBase 
{
	
public static WebDriver driver;
public static Properties prop;

public static void init() 
{
	prop = new Properties();
	try {
	FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\AutomationTestingSeptemberBatch\\configuration.properties");
	prop.load(file);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
	driver  = new ChromeDriver();
	}
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	
	else
	{
		System.out.println("Please select valid browser");
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
}


}
