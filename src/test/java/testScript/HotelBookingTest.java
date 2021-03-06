package testScript;

import org.testng.annotations.Test;
import pageFunction.HotelBookingPageFunction;
import utility.commonFunction;

public class HotelBookingTest extends commonFunction{
	
	@Test
    public void shouldBeAbleToSearchForHotels() {
		HotelBookingPageFunction hotelBookingPageFunction = new HotelBookingPageFunction(driver);
		
		hotelBookingPageFunction.clickOnHotelLnk();
		hotelBookingPageFunction.provideLocality("Indiranagar, Bangalore");
		hotelBookingPageFunction.provideTravelerSelection("1 room, 2 adults");
		hotelBookingPageFunction.clickSearchBtn();
	}
 }