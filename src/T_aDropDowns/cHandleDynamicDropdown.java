package T_aDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cHandleDynamicDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Java SeleniumWebdrivers\\geckodriver.exe");

	    WebDriver driver = new FirefoxDriver();
	    
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

		//  //a[@value='MAA']  - Xpath for chennai

		//  //a[@value='BLR']  - Xpath for bangalore

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		                         //OR
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

	}

}
