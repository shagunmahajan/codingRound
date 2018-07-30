package pageFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignInPageFunction {

	WebDriver driver;

	public SignInPageFunction(WebDriver driver) {
		this.driver = driver;
	}
	
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

}
