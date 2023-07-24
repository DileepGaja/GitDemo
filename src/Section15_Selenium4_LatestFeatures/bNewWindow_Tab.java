package Section15_Selenium4_LatestFeatures;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bNewWindow_Tab {

	public static void main(String[] args) throws IOException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Java SeleniumWebdrivers\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//This code will execute if selenium version is above 4.0
		
		//Switching Window
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentId=it.next();
		String childId=it.next();
		
		driver.switchTo().window(childId);
		
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName =driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(2).getText();
		
		driver.switchTo().window(parentId);
		
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		
		name.sendKeys(courseName);
		
		//Capture Webelement Screenshot using selenium
		File file=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\\\Users\\\\Gaja\\\\screenshot1.png"));
		
		//GEt Height & Width of webelement using selenium
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}

}
