package Section11_RealTimeExecises_EndtoEndProgramming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bcalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.redbus.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".sc-kAzzGY.dYHzlP")).click();
		
		List<WebElement> dates= driver.findElements(By.cssSelector("span[class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH']"));
		
		int count = driver.findElements(By.cssSelector("span[class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH']")).size();

		for(int i=0; i<count; i++)
		{
			String text=driver.findElements(By.cssSelector("span[class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH']")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector("span[class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH']")).get(i).click();
				break;
			}
		}
	}
	
	
	
	

}
