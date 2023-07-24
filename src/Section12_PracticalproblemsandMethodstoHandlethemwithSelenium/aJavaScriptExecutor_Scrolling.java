package Section12_PracticalproblemsandMethodstoHandlethemwithSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class aJavaScriptExecutor_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//to scroll the webpage
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		//to scroll the table present in webpage
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=1000","");
		
		List <WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		
		for(int i=0; i<values.size(); i++)
		{
			//values.get(i).getText();----->   gettext returns string ,so convert to integer   
			//Integer.parseInt(values.get(i).getText());----->converted to integer
			
			sum= sum + Integer.parseInt(values.get(i).getText());
		}
        System.out.println(sum);
        driver.findElement(By.cssSelector(".totalAmount")).getText();
        int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        
        Assert.assertEquals(sum, total);
	}

}
