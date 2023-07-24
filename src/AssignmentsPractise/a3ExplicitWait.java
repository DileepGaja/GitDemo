package AssignmentsPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class a3ExplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		//explicit wait
		  WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
        
        WebElement staticDropdown=driver.findElement(By.cssSelector("select.form-control"));
		
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(2);
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav-link.btn.btn-primary")));
		
		List <WebElement> products = driver.findElements(By.cssSelector(".btn.btn-info"));
		 
		for(int i = 0; i<products.size(); i++)
		{
			products.get(i).click();
		}
		
        driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
				
	}

}

