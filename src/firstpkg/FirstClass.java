package firstpkg;

 public class FirstClass
{
	
	public static void main(String[] args)
	{
		FirstClass fc = new FirstClass();  //object of the class
		
		fc.printvalues();
		
		fc.welcome();
		
		System.out.println(fc.loc);
	}
	
	int a = 10;
	float b = 10.5f;
	char c = 'X';
	String d = "Java";
	boolean e = true;
	
	String loc = "hyderabad";
	
	 public void printvalues() 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	public void welcome()
	{
		System.out.println("this is welcome java");
	}
	
	
}
