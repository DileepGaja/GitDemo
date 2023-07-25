package Section32_GIT;

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
	
    @Test
    public void StreamCollect()
    {
    	//creating new list 
    	List<String> ls=Stream.of("Dileep","Abhi","Boss","Aon","Aaxmi").filter(s->s.endsWith("i")).map(s->s.toUpperCase())
    	.collect(Collectors.toList());
    	System.out.println("the name is" +ls.get(0));
    	System.out.println("the name is" +ls.get(1));
    	System.out.println("the name is" +ls.get(2));
    	
    	//print unique numbers from array
    	//sort the array--> get 3rd index
    	List<Integer> numbers=Arrays.asList(1,5,2,2,6,4,3,5,8,4,2,9);
    	numbers.stream().distinct().forEach(s->System.out.println(s));
    	
    	List <Integer> value=numbers.stream().distinct().sorted().collect(Collectors.toList());
    	System.out.println("the 3rd index is "+value.get(3));
    	System.out.println("the 2nd index is "+value.get(2));
    	System.out.println("the 1st index is "+value.get(1));
    	System.out.println("the 1st index is "+value.get(1));
    }
    
    @Test
    public void gut()
    {
    	System.out.println("dboss");
    	System.out.println("ponnu");
    	System.out.println("darling");
    }
    
    @Test
    public void ret()
    {
    	System.out.println("boss");
    	System.out.println("naina");
    	System.out.println("bhavana");
    }
    
    @Test
    public void StreamCol()
    {
    	
    	System.out.println("TEST");
    	System.out.println("mobile");
    	System.out.println("android");

    }
    
    @Test
    public void olo()
    {
    	
    	System.out.println("Iphone");
    	System.out.println("LG");
    	

    }
    
}
