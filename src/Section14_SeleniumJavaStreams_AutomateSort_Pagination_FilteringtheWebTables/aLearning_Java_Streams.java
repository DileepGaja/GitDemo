package Section14_SeleniumJavaStreams_AutomateSort_Pagination_FilteringtheWebTables;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class aLearning_Java_Streams 
{
	
	//count the number of names starting with alphabet "A" in the list
	/*@Test
	public void regular()
	{
    	ArrayList<String> names= new ArrayList<String>();
    	
    	names.add("Dileep");
    	names.add("Abhi");
    	names.add("Boss");
    	names.add("Aon");
    	names.add("Aaxmi");
    	
    	int count = 0;
    	
    	for(int i=0; i<names.size(); i++)
    	{
    		 String actual=names.get(i);
    		 if(actual.endsWith("A"))
    		 {
				count++;
    		 }
    		System.out.println(count);
    	}
    	
    	
	}
    */
   
    @Test
    public void StreamFilter()
    {
        ArrayList<String> names= new ArrayList<String>();
    	
    	names.add("Dileep");
    	names.add("Abhi");
    	names.add("Boss");
    	names.add("Aon");
    	names.add("Aaxmi");
    	
    	//there is no lise for intermediate operation if there is no terminal operation
    	//terminal operation will execute only if intermediate operation (filter) returns true
    	//we can create stream
    	//how to use filter in stream API
    	
    	Long c=names.stream().filter(s->s.startsWith("B")).count();
    	System.out.println("the count is "+c);
    	
    	//to make stream compatible we can create stream
    	long d=Stream.of("Dileep","Abhi","Boss","Aon","Aaxmi").filter(s->s.startsWith("A")).count();      
    	System.out.println("the count of d is "+d);
    	
    	//print the names of array list
    	//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
    	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println("the length()>4 is  "+s));
    }
    
    @Test
    public void StreamMap()
    {
       ArrayList<String> names= new ArrayList<String>();
    	names.add("Dileep");
    	names.add("Abhi");
    	names.add("Boss");
    	names.add("Aon");
    	names.add("Aaxmi");
    	
    	//print names which have last letter as "a" with uppercase
    	Stream.of("Dileep","Abhi","Boss","Aon","Aaxmi").filter(s->s.endsWith("i")).map(s->s.toUpperCase())
    	.forEach(s->System.out.println(s));
    	
    	//print names which have last letter as "a" with uppercase and sorted
    	List <String> names1= Arrays.asList("Poi","Abhi","Boss","Aon","Aaxmi");
    	names1.stream().filter(s->s.endsWith("i")).sorted().map(s->s.toUpperCase())
    	.forEach(s->System.out.println(s));
    	
    	//merging two different list
    	Stream<String> newStream= Stream.concat(names.stream(), names1.stream());
    	//newStream.sorted().forEach(s->System.out.println(s));
    	
    	boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Boss"));
    	System.out.println(flag);
    	Assert.assertTrue(flag);
    }
    
    @Test
    public void StreamCollect()
    {
    	//creating new list 
    	List<String> ls=Stream.of("Dileep","Abhi","Boss","Aon","Aaxmi").filter(s->s.endsWith("i")).map(s->s.toUpperCase())
    	.collect(Collectors.toList());
    	System.out.println("the name is" +ls.get(0));
    	
    	//print unique numbers from array
    	//sort the array--> get 3rd index
    	List<Integer> numbers=Arrays.asList(1,5,2,2,6,4,3,5,8,4,2,9);
    	numbers.stream().distinct().forEach(s->System.out.println(s));
    	
    	List <Integer> value=numbers.stream().distinct().sorted().collect(Collectors.toList());
    	System.out.println("the 3rd index is "+value.get(3));
    }
    
}
