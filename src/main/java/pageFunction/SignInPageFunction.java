package pageFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SignInPageFunction {

	WebDriver driver = new ChromeDriver();

	private WebElement yourTrips = driver.findElement(By.linkText("Your trips"));
    private WebElement signInLnk = driver.findElement(By.id("SignIn"));
    private WebElement signInBtn = driver.findElement(By.id("signInButton"));
    private WebElement errorMsg = driver.findElement(By.id("errors1"));
    
    //click your trip option
    public void clickYourTrip() {
    	yourTrips.click();
    }
    
    //click on sign In Link
    public void clickSignInLnk() {
    	signInLnk.click();
    }
    
    //click on sign In button
    public void clickSignInBtn() {
    	signInBtn.click();
    }
    
    //Verify Error Message
    public void verifyErrMsg() {
    	Assert.assertTrue(errorMsg.getText().contains("There were errors in your submission"));
    }

//    private void setDriverPath() {
//        if (PlatformUtil.isMac()) {
//            System.setProperty("webdriver.chrome.driver", "chromedriver");
//        }
//        if (PlatformUtil.isWindows()) {
//            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        }
//        if (PlatformUtil.isLinux()) {
//            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
//        }
//    }


}
