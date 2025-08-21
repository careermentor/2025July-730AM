package secondPkg;

import firstpkg.FirstClass;

public class ThirdClass 
{

	int x = 500;  //global variable
	
	 public int age = 100;
	
	public void printValueX()
	{
		final int x = 100;  //constant  ,   local variable
		//x=200;
		
		final String name = "Java";
		//name="Python";
		
		System.out.println(x);  //100
		
		//age=50;
	}
	
	
	public void m2()
	{
		System.out.println(x);  //500
		//System.out.println(name);
		
		//age=100;
		
		System.out.println(age);
	}
	
	
	public static void main(String[] args) 
	{
	
		//FirstClass abc = new FirstClass();
		
		//abc.printvalues();
		//abc.welcome();
		
		ThirdClass tc = new ThirdClass();
		tc.printValueX();
		tc.m2();
		
	}
	
}
