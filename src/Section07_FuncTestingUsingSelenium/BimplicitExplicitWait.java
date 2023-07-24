package Section07_FuncTestingUsingSelenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BimplicitExplicitWait
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Java SeleniumWebdrivers\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);
		
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot","Cauliflower" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		addItems(driver,itemsNeeded);    //without creating object of the class
		                        //OR
		//BimplicitExplicitWait w = new BimplicitExplicitWait();
		//w.addItems(driver, itemsNeeded);
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//explicit wait
		//WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver,String[] itemsNeeded)
	
	{
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
