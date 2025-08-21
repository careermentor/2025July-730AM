package org.wipro.auto.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.fb.basepkg.BaseTest;
import org.wipro.auto.fb.pages.SignupPage;

public class SignupScenario extends BaseTest
{

	@Test
	public void tc02_signup_func_valid_data() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccount_bttn();
		sign.enter_firstname("John");
		sign.select_birthday_dob_day("15");
		sign.click_gen_male();
		sign.enter_username("modisantosh@gmail.com");
		
		
	}
	
	
	
	
}
