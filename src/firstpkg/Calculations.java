package firstpkg;

public class Calculations 
{
	
	public Calculations()
	{
		System.out.println("this is constructor");
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("sum of a&b: " + c);
	
	} 

	
	public int sum()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
		
	}
	
	public Calculations(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of a&b: " + c);
	
	}
	
	public Calculations(int a, float b)
	{
		float c = a+b;
		System.out.println("addition of a&b: " + c);
	
	}
	
	public int add(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		return c;
	}
	
	public static void main(String[] args)
	{
		Calculations cal1 = new Calculations();  //Constructor will be automatically get called
	
		Calculations cal2 = new Calculations(30, 40);  //Constructor will be automatically get called
		
		Calculations cal3 = new Calculations(30, 40.5f);
		
		cal2.sum();
		
		cal2.add(50, 60);
		
	}
	
}
