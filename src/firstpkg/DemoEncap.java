package firstpkg;

public class DemoEncap 
{

	private int age = 40;
	
	
	
	public int getAge() 
	{
		return age;
	}



	public void setAge(int age) 
	{
		this.age = age;
	}



	public static void main(String[] args) 
	{
		DemoEncap de = new DemoEncap();
		System.out.println(de.getAge());
		
		System.out.println(de.age);

	}

}
