package com.shu;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.shubha.App;
public class AppTest {
	@Test
	public void testlogin1()
	{
	  App myapp=new App();
      Assert.assertEquals(0,myapp.userlogin("Admin","admin123"));
	}
	
	@Test
	public void testlogin2()
	{
		
	  App myapp=new App();
      Assert.assertEquals(1,myapp.userlogin("Admin","admin123"));
	}


}
