package testngDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario8 
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Hello", "Hello World");
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
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Hello", "Hello World");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
}
