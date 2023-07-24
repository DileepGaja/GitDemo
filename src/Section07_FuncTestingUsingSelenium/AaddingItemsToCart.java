package Section07_FuncTestingUsingSelenium;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class AaddingItemsToCart 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Java SeleniumWebdrivers\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot","Cauliflower" };

		int j = 0;
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < product.size(); i++) 
		{
			// Brocolli - 1 Kg

			// Brocolli, 1 kg

			String[] name = product.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// format it to get actual vegetable name
			// convert array into array list for easy search
			// check whether name you extracted is present in arrayList or not-
			
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))
			   {
				
				j++;
				
				// click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)
				   {
					break;
				   }

			   }
		 }
		
	}

}
