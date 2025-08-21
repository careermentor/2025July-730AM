package org.wipro.auto.fb.basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.auto.fb.utilitiespkg.ReadAllDataFiles;

public class BaseTest 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void initiateBrowser() throws Exception
	{
		if(ReadAllDataFiles.readconfigprop("BrowserName").equalsIgnoreCase("CHROME"))
		
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadAllDataFiles.readconfigprop("BrowserName").equalsIgnoreCase("EDGE"))
			
		{
			driver = new EdgeDriver();
		}
		
		else if(ReadAllDataFiles.readconfigprop("BrowserName").equalsIgnoreCase("Safari"))
			
		{
			driver = new SafariDriver();
		}
		
		else 
		{
			driver = new EdgeDriver();
		}
		
		driver.get(ReadAllDataFiles.readconfigprop("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
