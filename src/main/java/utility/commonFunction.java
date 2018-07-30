package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.Exception;


public class commonFunction{

	public static WebDriver driver;
	
	private void setDriverPath() {
	//  if (PlatformUtil.isMac()) {
	//      System.setProperty("webdriver.chrome.driver", "chromedriver");
	//  }
	//  if (PlatformUtil.isWindows()) {
	//      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	//  }
	//  if (PlatformUtil.isLinux()) {
	//      System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
	//  }
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	}
	
	private void initializeBrowser() {
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	}
	
	public static void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
        	throw new Exception("Element not found");  //To change body of catch statement use File | Settings | File Templates.
        }
    }
	
	@BeforeMethod
	public void openApplication() {
		 setDriverPath();
		 initializeBrowser();	
		 driver.get("https://www.cleartrip.com/");
		 waitFor(2000);
	}
	 
	@AfterMethod
	public void closeBrowser() {
		 driver.quit();
	}
}