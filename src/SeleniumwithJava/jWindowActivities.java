package SeleniumwithJava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jWindowActivities {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.close();
		

	}

}
