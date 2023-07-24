package Section13_MiscellaneoustopicsinSeleniumWebDriver;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class aBrowserOption {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		// FirefoxOptions options1 = new FirefoxOptions();
		// EdgeOptions options2 = new EdgeOptions();
		
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		option.setCapability("proxy", proxy);

		//Set download directory
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		option.setExperimentalOption("prefs", prefs);

		option.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());
		}
	}


