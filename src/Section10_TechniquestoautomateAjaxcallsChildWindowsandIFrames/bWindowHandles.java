package Section10_TechniquestoautomateAjaxcallsChildWindowsandIFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bWindowHandles 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//[parentid,childid,subchildId]
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it= windows.iterator();
		
		String ParentId=it.next();
		String ChildId=it.next();
		
		driver.switchTo().window(ChildId);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(ParentId);
		
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
