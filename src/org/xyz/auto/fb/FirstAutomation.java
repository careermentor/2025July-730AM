package org.xyz.auto.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser()
	{
		
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}

	@Test
	public void login_fynctionality()
	{
		
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("6868669999");
		
		driver.findElement(By.name("pass")).sendKeys("vbkabvkvCFG@345");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	}
	
	@Test
	public void signup_fynctionality()
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("John");
		
		driver.findElement(By.name("firstname")).clear();
		
		driver.findElement(By.name("firstname")).sendKeys("David");
		
		Select dob_day = new Select(driver.findElement(By.name("birthday_day")));
		//dob_day.selectByIndex(7);
		//dob_day.selectByValue("8");
		dob_day.selectByVisibleText("10");
		
		//dob_day.deselectByVisibleText("Sep");
		//dob_day.deselectAll();
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("websubmit"))));
		
		
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	
}
