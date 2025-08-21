package org.wipro.auto.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.fb.basepkg.BaseTest;
import org.wipro.auto.fb.datageneratorpkg.TestDataGen;
import org.wipro.auto.fb.pages.SignupPage;

public class SignupScenario_DDF extends BaseTest
{

	@Test(dataProvider = "signup_data", dataProviderClass=TestDataGen.class)
	public void tc02_signup_func_valid_data(String name, String day, String username) throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccount_bttn();
		sign.enter_firstname(name);
		sign.select_birthday_dob_day(day);
		sign.click_gen_male();
		sign.enter_username(username);
	}
	
	
	
	
}
