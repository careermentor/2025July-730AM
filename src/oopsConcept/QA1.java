package oopsConcept;

public class QA1 
{
	
	int x = 500;
	
	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of a&b: " + c);
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("addition of a&b: " + c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("addition of a&b&c: " + d);
	}
	
	public static void main(String[] args) {
		
		QA1 q1 = new QA1();
		q1.sum(30, 40);
		main(20);
		
	}
	
	public static void main(int a) {
		
		int b = a*a;
		System.out.println(b);
		
	}
}
