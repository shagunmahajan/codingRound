package pageFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.commonFunction;

public class SignInPageFunction {

	WebDriver driver;

	public SignInPageFunction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Your trips")
	private WebElement yourTrips;
	
	@FindBy(id = "SignIn")
	private WebElement signInLnk;
	
	@FindBy(id = "signInButton")
	private WebElement signInBtn;
	
	@FindBy(id = "errors1")
	private WebElement errorMsg;
	
	@FindBy(id = "modal_window")
	private WebElement frame;
	    
    //click your trip option
    public void clickYourTrip() {
    	yourTrips.click();
    }
    
    //click on sign In Link
    public void clickSignInLnk() {
    	signInLnk.click();
    	commonFunction.waitFor(3000);
    }
    
    //click on sign In button
    public void clickSignInBtn() {
    	driver.switchTo().frame(frame);
    	signInBtn.click();
    }
    
    //Verify Error Message
    public void verifyErrMsg() {
    	Assert.assertTrue(errorMsg.getText().contains("There were errors in your submission"));
    }

}
