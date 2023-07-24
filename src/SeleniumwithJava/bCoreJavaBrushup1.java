package SeleniumwithJava;

public class bCoreJavaBrushup1 {

	public static void main(String[] args) {
		int myNUM= 5;
		String website = "Rahul Shetty";
		char letter='r';
		double dec=0.55;
		boolean myCard=true;
		
		System.out.println(myNUM  +"is the value stored in the myNUM variable");
		System.out.println(website +"is the value stored in the website variable");
		System.out.println(letter  +"is the value stored in the letter variable");
		System.out.println(dec  +"is the value stored in the dec variable");
		System.out.println(myCard  +"is the value stored in the myCard variable");
		
		//ARRAYS
		
		int[] arr= new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr1= {1,2,3,4,5,6,7,8,9};
		
		String[] name={"Dileep, Gaja, DBoss"};
		
		
		//for loop
		
		//for(int i=0; i<arr.length; i++)
		{
		//	System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for(String s:name)
		{
			System.out.println(s);
		}
		

	}

}
