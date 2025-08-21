package org.xyz.auto.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKBMouseWindows 
{
	WebDriver driver;
	
	@Test
	public void handleFrmaes() throws Exception
	{
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		CaptureScreenshot.testresult(driver,"handleFrmaes");
	
	}
	
	@Test(enabled=true)
	public void handleAlerts() throws Exception
	{
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signin-btn")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.testresult(driver,"handleAlerts");
		
	}
	
	@Test(enabled=false)
	public void handleMouse()
	{
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
		//act.click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
		
		//act.doubleClick(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
		
		//WebElement src = driver.findElement(By.id(""));
		//WebElement tgt = driver.findElement(By.id(""));
		//act.dragAndDrop(src, tgt).perform();
	
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> winsid = driver.getWindowHandles();
		System.out.println(winsid);
		
		Iterator<String> itr = winsid.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		
		driver.quit();
		
	}
	
	@Test(enabled=false)
	public void handleKeyboard()
	{
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("user1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass1234").perform();
		//act.sendKeys(Keys.ENTER).perform();
		
		//driver.close();
	}
	
}
