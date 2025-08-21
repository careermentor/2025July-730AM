package oopsConcept;

public abstract class AbsClassDemo 
{

	
	public void m1()
	{
		System.out.println("this is concrete method");
		

		final int a = 20;
		//a=30;
		System.out.println(a);
		
	}
	
	public abstract void m2();
	
	public static void main(String[] args) 
	{
	
		//AbsClassDemo ac = new AbsClassDemo();
		//ac.m1();
		
	}
	
}
