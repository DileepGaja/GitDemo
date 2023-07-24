package SeleniumwithJava;

import java.lang.reflect.Method;

public class eMethodsDemo 
{

	public static void main(String[] args) 
	{
		eMethodsDemo m= new eMethodsDemo();
		String s=m.getData();
		System.out.println(s);
		
		
		fMethodsDemo m1= new fMethodsDemo();
		String s1=m1.getUserData();
		System.out.println(s1);
	}
	public static String getData()

	{

	System.out.println ("hello world");

	return "rahul shetty";

	}
	
	
}
