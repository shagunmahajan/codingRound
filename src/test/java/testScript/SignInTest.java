package testScript;

import org.testng.annotations.Test;
import pageFunction.SignInPageFunction;
import utility.commonFunction;

public class SignInTest extends commonFunction {
	   
	
	@Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
	
		SignInPageFunction signInPageFunction = new SignInPageFunction(driver);
		signInPageFunction.clickYourTrip();
		signInPageFunction.clickSignInLnk();
		signInPageFunction.clickSignInBtn();
		signInPageFunction.verifyErrMsg();
		
//        setDriverPath();
//
//        driver.get("https://www.cleartrip.com/");
//        waitFor(2000);
//
//        driver.findElement(By.linkText("Your trips")).click();
//        driver.findElement(By.id("SignIn")).click();
//
//        driver.findElement(By.id("signInButton")).click();
//
//        String errors1 = driver.findElement(By.id("errors1")).getText();
//        Assert.assertTrue(errors1.contains("There were errors in your submission"));
//        driver.quit();
    }
}