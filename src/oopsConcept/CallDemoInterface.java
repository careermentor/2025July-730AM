package oopsConcept;

public class CallDemoInterface implements DemoInterface
{

	public static void main(String[] args)
	{
		CallDemoInterface cd = new CallDemoInterface();
		cd.m3();
		cd.m4();
		cd.m5();
		cd.m6();

	}

	
	public void m3() {
		
		System.out.println("this is method 3");
	}

	
	public void m4() {
		
		System.out.println("this is method 3");
		
	}

	
	public void m5() {
		
		System.out.println("this is method 3");
		
	}

	
	public void m6() {
		
		System.out.println("this is method 3");
	}

}
