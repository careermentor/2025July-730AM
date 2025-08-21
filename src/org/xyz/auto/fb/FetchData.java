package org.xyz.auto.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FetchData 
{
	WebDriver driver;
	
	@Test
	public void launchbrowser()
	{
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		String exp_URL="https://www.facebook.com/";
		
		driver.get(exp_URL);
		
		String act_URL= driver.getCurrentUrl();
		System.out.println(act_URL);
		
		Assert.assertEquals(act_URL, exp_URL);
		
		String exp_title = "Facebook – log in or sign up";
		
		String act_title = driver.getTitle();
		
		Assert.assertEquals(act_title, exp_title);
		
		String exp_username_textbox = "Email address or phone number";
		
		String act_username_textbox = driver.findElement(By.id("email")).getDomAttribute("placeholder");
		
		System.out.println(act_username_textbox);
		
		Assert.assertEquals(act_username_textbox, exp_username_textbox);
		
		Assert.assertEquals(driver.findElement(By.cssSelector("[type='submit']")).getText(), "Log in");
		
		System.out.println(driver.findElement(By.cssSelector("[type='submit']")).getLocation());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.findElement(By.cssSelector("[type='submit']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("[type='submit']")).isEnabled());
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).isDisplayed());
		
		driver.close();
	}
	
}
