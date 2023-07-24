package AssignmentsPractise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class a4WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
        Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it= windows.iterator();
		
		String ParentId = it.next();
		String ChildId = it.next();
		
		driver.switchTo().window(ChildId);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
        driver.switchTo().window(ParentId);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		
	}

}
