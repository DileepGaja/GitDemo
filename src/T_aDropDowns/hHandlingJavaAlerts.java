package T_aDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hHandlingJavaAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");

		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
         
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		//Switch To Alert Example 
		driver.findElement(By.id("name")).sendKeys("Dileep");
		
		//alert
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//confirm
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
