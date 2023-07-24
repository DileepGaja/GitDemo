package Section11_RealTimeExecises_EndtoEndProgramming;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class aLinksCount_openlinksinsepTab_ {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Count of the Link in the Entire Page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Count of links in the footer section of the page
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//Count of links in the footer section of column 2
		WebElement columndriver=driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on all the links and check if the pages are opening
        for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
        {
        	String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
        	
        	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
        }
        
        //Getting the Titles of all the tabs with optimized while loop
        
        Set <String> abc=driver.getWindowHandles();
        Iterator<String> it=abc.iterator();
        
        while(it.hasNext())
        {
        	driver.switchTo().window(it.next());
        	System.out.println(driver.getTitle());
        }
        
        
	}

}
