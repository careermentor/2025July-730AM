package oopsConcept;

public class CallAbsClassDemo extends AbsClassDemo
{

	int a = 20;
	
	
	public void m2() 
	{
		System.out.println("credential");
		
	}

	
	public static void main(String[] args) {
		
		
		CallAbsClassDemo cac = new CallAbsClassDemo();
		cac.m1();
		cac.m2();
	}
	
}
