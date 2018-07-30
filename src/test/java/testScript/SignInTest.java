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
    }
}