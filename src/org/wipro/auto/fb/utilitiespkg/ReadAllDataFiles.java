package org.wipro.auto.fb.utilitiespkg;


import java.io.FileReader;
import java.util.Properties;

public class ReadAllDataFiles 
{

	public static String readconfigprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		return prop.get(key).toString();
	}

	public static String  readelementprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		return prop.get(key).toString();
	}
	
}
