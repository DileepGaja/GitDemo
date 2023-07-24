package AssignmentsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class a6PracticeExerciseAssignment 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	    driver.findElement(By.id("checkBoxOption3")).click();
	    String label= driver.findElement(By.cssSelector("label[for='honda']")).getText();
        
	    WebElement dropDown=driver.findElement(By.id("dropdown-class-example"));
	    
	    Select s=new Select(dropDown);
	    
	    s.selectByVisibleText(label);
	    
	    driver.findElement(By.id("name")).sendKeys(label);
	    driver.findElement(By.id("alertbtn")).click();
	    
	    String text=driver.switchTo().alert().getText();
	    if(text.contains(label))
	    {
	    	System.out.println("success");
	    }
	    else
	    {
	    	System.out.println("fail");
	    }
	}

}
