package firstpkg;

import secondPkg.ThirdClass;

public class SecondClass {

	public static void main(String[] args)
	{
		/*int a = 10;
		float b = 10.5f;
		char c = 'X';
		String d = "Java";
		boolean e = true;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		ThirdClass tc = new ThirdClass();
		tc.printValueX();
		tc.m2();
		
		System.out.println(tc.age);*/
		
		DemoEncap de = new DemoEncap();
		System.out.println(de.getAge());
		
		System.out.println(de.getAge());
		
		//System.out.println(de.age);
		
		DemoClassStatic.printA();

	}

}
