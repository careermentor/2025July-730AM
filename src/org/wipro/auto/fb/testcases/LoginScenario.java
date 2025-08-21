package org.wipro.auto.fb.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.wipro.auto.fb.basepkg.BaseTest;
import org.wipro.auto.fb.pages.LoginPage;

public class LoginScenario extends BaseTest
{

	@Test
	public void tc01_login_func_valid_credentials() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("User1");
		login.enter_password("Pass1");
		login.click_loginbttn();
		
		//because "this.driver" is null
		
		Assert.assertEquals(driver.getTitle(), "Facebook");
		
	}
	
	
	
	
}
