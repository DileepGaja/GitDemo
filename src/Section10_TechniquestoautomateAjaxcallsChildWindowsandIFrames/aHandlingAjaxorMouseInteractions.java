package Section10_TechniquestoautomateAjaxcallsChildWindowsandIFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class aHandlingAjaxorMouseInteractions 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		WebElement move=driver.findElement(By.cssSelector("a[id*='nav-link-accountList']"));
		
		Actions a =new Actions(driver);
		//click on search and enter hello 
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//move to specific element 
	    a.moveToElement(move).build().perform();

	  //move to specific element and right click
	    a.moveToElement(move).contextClick().build().perform();
	}

}
