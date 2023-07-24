package SeleniumwithJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cCoreJavaBrushup2 {

	public static void main(String[] args) 
	{
		int[] arr1= {1,2,3,4,5,6,7,8,9};
		
		//check if array is multiple of 2
		
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i] % 2 ==0)
			{
				System.out.println(arr1[i]);
				//break;   to skip further looping
			}
			else
			{
				System.out.println(arr1[i] +"is not multiple of 2");
			}
				
		}

		ArrayList<String> a =new ArrayList<String>();
		//create object of the class- object.method
		
		a.add("Dileep");
		a.add("Selenium");
		a.add("Gaja");
		a.add("Dili");
		System.out.println(a.get(3));
		
		System.out.println("***************");
		
		for(int i=0; i<a.size(); i++)      //normal loop
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("***************");
		
		for(String val:a)      //normal loop
		{
			System.out.println(val);
		}
		
		System.out.println("***************");
		
		//to check item present in arraylist
		System.out.println(a.contains("Gaja"));   //boolean value
		
		System.out.println("***************");
		
		//convert Array to ArrayList
		String[] name={"Dileep","Gaja", "DBoss"};
		
		List<String>nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Gaja"));
		
	}

}
