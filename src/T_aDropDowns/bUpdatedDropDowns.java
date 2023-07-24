package T_aDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class bUpdatedDropDowns {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Java SeleniumWebdrivers\\geckodriver.exe");

		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Java SeleniumWebdrivers\\chromedriver.exe");

		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
         
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
//CheckBox		
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
// count number of checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	  /*int i=1;
		while(i<5)
		{
		  driver.findElement(By.id("hrefIncAdt")).click(); //4times click
          i++;
		}*/
		                     //OR
		
		for(int i=3; i<5; i++)
		{
		  driver.findElement(By.id("hrefIncAdt")).click(); //2times click
         
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();   
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
