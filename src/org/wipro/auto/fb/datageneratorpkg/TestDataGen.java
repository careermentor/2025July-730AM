package org.wipro.auto.fb.datageneratorpkg;

import org.testng.annotations.DataProvider;

public class TestDataGen
{

	@DataProvider(name="userdata")
	public Object[][] testdata()
	{
		//String data1 = "user1"; //simple
		//Object[] data2 = {"User1","Pass1"};  //1-D
		
		Object[][] data3 = {{"User1","Pass1"},{"User2","Pass2"},{"User3","Pass3"}};  //2-d
		return data3;
	}
	
	
	@DataProvider(name="signup_data")
	public Object[][] testdata_signup()
	{
		//String data1 = "user1"; //simple
		//Object[] data2 = {"User1","Pass1"};  //1-D
		
		Object[][] data3 = {{"John","16","finaluser@gmail.com"},{"David","17","Secretuser@gmail.com"}};  //2-d
		return data3;
	}
	
}
