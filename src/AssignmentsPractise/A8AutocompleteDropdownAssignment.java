package AssignmentsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A8AutocompleteDropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		                              //OR
		/*driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> values = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));



		for(int i=0;i<values.size();i++) 
		{
		
		if(values.get(i).getText().equalsIgnoreCase("india")) 
		{
		values.get(i).click();

		break;
		}
		
		}
		
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		*/
	}

}
