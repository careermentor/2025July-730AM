package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario 
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
		
		Assert.assertEquals("Hello", "Hello World");  //fail
		System.out.println("this is failed");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Hello", "Hello World");
		
		System.out.println("this is failed");
		
		sa.assertAll();
	
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
}
