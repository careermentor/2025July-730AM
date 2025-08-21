package oopsConcept;

public class QA2 extends QA1
{
	
	int x = 100;
	
	public void printX()
	{
		final int x = 200;
		//x=300;
		System.out.println(x);   //200
		System.out.println(this.x);  //100
		System.out.println(super.x);
		
		super.sum(40, 50);
	}
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("addition of a&b: " + c);
	}

	public void subs(int a, int b)
	{
		int c = a-b;
		System.out.println("substraction of a&b: " + c);
	}
	
public static void main(String[] args) {
		
		QA2 q2 = new QA2();
		
		q2.printX();
		
		//q2.subs(30, 20);
		q2.sum(40, 50);
	//q2.qa1im();
	}


public void qa1im() {
	
	System.out.println("this is QA1I Method");
}
	
}
