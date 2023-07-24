package SeleniumwithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class aINVOKINGBROWSER {

	public static void main(String[] args) {
		
		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods

		// Chrome

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
		
		
		driver.findElement(By.className("gLFyf")).sendKeys("Dileep");
		driver.close();
		

        //driver.close();

		//Firefox

		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Java SeleniumWebdrivers\\geckodriver.exe");

		//WebDriver driver1 = new FirefoxDriver();
		
		//driver1.get("https://www.google.com/");
		
		
		//driver1.findElement(By.className("gLFyf")).sendKeys("Dileep");
		//driver1.close();
		

		//Microsoft Edge

		//System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

		//WebDriver driver2 = new EdgeDriver();

		//driver.get("https://rahulshettyacademy.com");

		//System.out.println(driver.getTitle());

		//System.out.println(driver.getCurrentUrl());

		//driver.close();

		//driver.quit();

	}

}
