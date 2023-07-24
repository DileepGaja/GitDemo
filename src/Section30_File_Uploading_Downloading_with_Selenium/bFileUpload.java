package Section30_File_Uploading_Downloading_with_Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bFileUpload {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.cssSelector("a[class$='uploader__btn tooltip--left active']")).click();
		
		Thread.sleep(3000);
		
		//to execute .exe file
		Runtime.getRuntime().exec("E:\\new\\Notes\\AutoIT\\upload.exe");

	}

}
