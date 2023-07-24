package Section13_MiscellaneoustopicsinSeleniumWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bDeleteCookies_TakeScreenshots {

	public static void main(String[] args) throws IOException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(option);
		
		//to maximize/minimize window
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		//to delete cookies
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("selected key"); --------->//to delete specific cookie
		
		driver.get("https://www.google.com/");
		/*
		        //Convert web driver object to TakeScreenshot
                TakesScreenshot scrShot =((TakesScreenshot)driver);

                //Call getScreenshotAs method to create image file
                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

                 //Move image file to new destination
                File DestFile=new File("C:\\Users\\Gaja\\screenshot.png");

                //Copy file at destination
                FileUtils.copyFile(SrcFile, DestFile);
         */       
                                 //OR
                
                File scrShot1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrShot1, new File("C:\\Users\\Gaja\\screenshot1.png"));
               
                
	}

}
