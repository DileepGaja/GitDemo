package AssignmentsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class a2UIDropdownsEditBoxesErrorValdiation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Java SeleniumWebdrivers\\chromedriver.exe");

		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
         
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("Dileep");
		
		driver.findElement(By.name("email")).sendKeys("dileepgaja@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Dileep@1991");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticdropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select Dropdown=new Select(staticdropdown);
		
		Dropdown.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("12/27/1991");
		
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
	}

}
