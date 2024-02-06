package program;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginpagetest extends testbase {

	loginpage loginpage;
	
	
	@BeforeMethod
	public void initialization() {
		init();
		loginpage=new loginpage();
	}
		
		@Test
		
		public void validateLoginTest() {
			
			loginpage.login();
		}
			
			@AfterMethod
			public void teardown() {
				driver.close();
			}
		
	}

