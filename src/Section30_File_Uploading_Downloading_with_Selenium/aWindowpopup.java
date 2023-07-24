package Section30_File_Uploading_Downloading_with_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aWindowpopup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		//driver.get("https://the-internet.herokuapp.com/"); //---->pop-up will be displayed
		
		//----> passing username and password with URL which automate window control(no pop-up will be displayed)
		driver.get("https://admin:admin@the-internet.herokuapp.com/");  
		
		driver.findElement(By.linkText("Basic Auth")).click();

	}

}
