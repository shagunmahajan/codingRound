package testScript;

import org.testng.annotations.Test;
import pageFunction.FlightBookingPageFunction;
import utility.commonFunction;

public class FlightBookingTest extends commonFunction{

    @Test
    public void testThatResultsAppearForAOneWayJourney() {

    	FlightBookingPageFunction flightBookingPageFunction = new FlightBookingPageFunction(driver);
    	
    	flightBookingPageFunction.selectOneWayTab();
    	flightBookingPageFunction.provideFromCity("Bangalore");
    	flightBookingPageFunction.provideToCity("Delhi");
    	flightBookingPageFunction.selectDate();
    	flightBookingPageFunction.clickOnSearch();
    	flightBookingPageFunction.verfiySearchSummary();
    	
    }
}
