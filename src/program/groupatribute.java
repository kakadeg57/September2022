package program;

import org.testng.annotations.Test;

public class groupatribute {
	
	    
	  @Test(groups="software company")
      public void infoses() {
		System.out.println("infoses");
	}
	@Test(groups="software company")
	public void swaraj() {
		System.out.println("swaraj");
	}
	@Test (groups="automobile company")
	public void manoj() {
		System.out.println("manoj");
	}
	@Test (groups="automobile  company")
	public void anshika()
	{
		System.out.println("anshika");
	}
}
