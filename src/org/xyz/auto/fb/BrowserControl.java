package org.xyz.auto.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserControl 
{
	WebDriver driver;
	
	@Test
	public void launchbrowser()
	{
		
		driver= new EdgeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
		//driver.close();  //close only one window
		driver.quit(); //close all the windows
		
	}	
		
}
