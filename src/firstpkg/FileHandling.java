package firstpkg;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class FileHandling
{

	public static void readprop() throws Exception
	{
		
			FileReader fr = new FileReader("./TestData/data.properties");
			
			Properties prop = new Properties();
			prop.load(fr);
			System.out.println(prop.get("name"));
			System.out.println(prop.get("url"));
	}
	
	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Training\\Course-Manual_Automation\\gpt.txt");
		
		File f = new File("./TestData/abc.txt");
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();
		
		while(r!=-1)
		{
			System.out.print((char)r);  //casting
			r = fr.read();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		readprop();
	}
	
}
