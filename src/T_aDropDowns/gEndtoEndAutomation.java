package T_aDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class gEndtoEndAutomation 
{

	public static void main(String[] args) throws InterruptedException
     {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Java SeleniumWebdrivers\\chromedriver.exe");

		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
         
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		//one trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		//from
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(3000);
		//to
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//select depart date 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		//check return Date is enabled before and after clicking round trip
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		//passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i=3; i<5; i++)
		{
		  driver.findElement(By.id("hrefIncAdt")).click(); //2times click
         
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();   
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//currency
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		
		List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option1 : options)
		{
			if(option1.getText().equalsIgnoreCase("India"))
			{
				option1.click();
				break;
			}
				
				
		}
		
		//checkbox
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		//search button
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}

}
