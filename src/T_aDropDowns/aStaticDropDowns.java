package T_aDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class aStaticDropDowns {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Java SeleniumWebdrivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropDown=new Select(staticDropdown);
		
		dropDown.selectByIndex(2);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		dropDown.selectByVisibleText("USD");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		dropDown.selectByValue("INR");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		driver.close();

	}

}
