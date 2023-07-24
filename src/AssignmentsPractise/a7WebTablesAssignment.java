package AssignmentsPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class a7WebTablesAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);
		driver.get("http://qaclickacademy.com/practice.php");
		
		/*WebElement table=driver.findElement(By.id("product"));
		
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		List <WebElement> secondrow= driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		*/
		                           
		                                 //OR
		
		int rowsize=driver.findElements(By.xpath("//table[@name='courses']//tr")).size();
        int colsize=driver.findElements(By.xpath("//table[@name='courses']//th")).size();
        System.out.println("Row size is "+rowsize);
        System.out.println("Column size is "+colsize);
        System.out.println(driver.findElement(By.xpath("//table[@name='courses']//tr[3]")).getText());

	}

}
