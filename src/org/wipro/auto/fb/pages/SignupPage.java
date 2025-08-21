package org.wipro.auto.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.fb.utilitiespkg.ReadAllDataFiles;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void click_createnewaccount_bttn() throws Exception
	{
		driver.findElement(By.xpath(ReadAllDataFiles.readelementprop("login_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadAllDataFiles.readelementprop("signup_firstname_name"))).sendKeys(fname);
	}
	
	
	public void select_birthday_dob_day(String day) throws Exception
	{
		Select bdob_day = new Select(driver.findElement(By.name(ReadAllDataFiles.readelementprop("signup_birthday_day_name"))));
		
		bdob_day.selectByVisibleText(day);;
	}
	
	public void click_gen_male() throws Exception
	{
		driver.findElement(By.xpath(ReadAllDataFiles.readelementprop("signup_gen_male_xpath"))).click();
	}
	
	
	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.name(ReadAllDataFiles.readelementprop("signup_username_name"))).sendKeys(uname);
	}
	
	
	
	
	
}
