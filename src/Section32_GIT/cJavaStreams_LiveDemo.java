package Section32_GIT;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class cJavaStreams_LiveDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//to get font size of search box
		WebElement font=driver.findElement(By.id("search-field"));
	      String FontSize = font.getCssValue("Font-Size");
	      System.out.println("FontSize" +FontSize);
	      
	      font.sendKeys("Tomato");
		
		// capture all webelements into list(column)
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));   //----> 2 result
		
		List<WebElement> filteredList=veggies.stream().filter(veggie->veggie.getText()
				.contains("Tomato")).collect(Collectors.toList());                            //----> 2 result
		
		Assert.assertEquals(veggies.size(), filteredList.size());
		
		
	}

}
