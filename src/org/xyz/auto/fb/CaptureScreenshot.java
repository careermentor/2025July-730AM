package org.xyz.auto.fb;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot
{
	public static void testresult(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //take screenshot
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./screenshot_sprint1/" + name + ".png");
		
		
	//	String loc = "India";
	//	System.out.println("I live in " + loc + " India is my country" );
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
