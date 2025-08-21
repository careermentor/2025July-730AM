package org.wipro.auto.fb.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.fb.basepkg.BaseTest;
import org.wipro.auto.fb.datageneratorpkg.TestDataGen;
import org.wipro.auto.fb.pages.LoginPage;

public class LoginScenario_DDF extends BaseTest
{

	@Test(dataProvider = "userdata", dataProviderClass=TestDataGen.class)
	public void tc01_login_func_valid_credentials(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
		//because "this.driver" is null
	}
	
	
	
	
}
