package Section13_MiscellaneoustopicsinSeleniumWebDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

public class cBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//broken URL

        //  Step 1 - is to get all urls tied up to the links using Selenium
        //  Java methods will call URL's and gets you the status code
        //  if status code >400 then that url is not working-> link which tied to url is broken
		
		//To validate specific URL
		
		/*String url= driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection)(new URL(url).openConnection());
		
		conn.setRequestMethod("HEAD");
		conn.connect();
		
		int responseCode=conn.getResponseCode();
		System.out.println(" " +responseCode);
		*/
		
		
		//Iterate over all links in the page to validate broken Links
		
        List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        
        //to identify the specific brokenlink from all the links in the page
        SoftAssert a = new SoftAssert();
        
        for(WebElement link:links)
        {
		
        String url=link.getAttribute("href");
        	
		HttpURLConnection conn = (HttpURLConnection)(new URL(url).openConnection());
		
		conn.setRequestMethod("HEAD");
		conn.connect();
		
		int responseCode=conn.getResponseCode();
		System.out.println(" " +responseCode);
		
		a.assertTrue(responseCode<400, "The link with Text"+link.getText()+" is broken with code" +responseCode);
		
        }
        
        a.assertAll();
	}

}
