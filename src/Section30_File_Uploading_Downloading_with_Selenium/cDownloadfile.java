package Section30_File_Uploading_Downloading_with_Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class cDownloadfile {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		String downloadPath=System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options=new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.cssSelector("a[class$='uploader__btn tooltip--left active']")).click();
		
		Thread.sleep(3000);
		
		//to execute .exe file
		Runtime.getRuntime().exec("E:\\new\\Notes\\AutoIT\\upload.exe");
		
		//download file
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class$='btn btn--process btn--red pdfjpg pulse']")));
		driver.findElement(By.cssSelector("button[class$='btn btn--process btn--red pdfjpg pulse']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class$='downloader__btn active']")));
		driver.findElement(By.cssSelector("a[class$='downloader__btn active']")).click();
		
		//File f=new File("C:\\Users\\Gaja\\Downloads\\ilovepdf_pages-to-jpg.zip");
		
		File f=new File(downloadPath+ "//ilovepdf_pages-to-jpg.zip");
		
		Thread.sleep(5000);
		
		if(f.exists())

		{

		Assert.assertTrue(f.exists());

		if(f.delete())

		System.out.println("file deleted");

		}
		
		
	}

}
