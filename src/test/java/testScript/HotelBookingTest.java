package testScript;

import org.testng.annotations.Test;
import pageFunction.HotelBookingPageFunction;

public class HotelBookingTest {
	
	@Test
    public void shouldBeAbleToSearchForHotels() {
		HotelBookingPageFunction hotelBookingPageFunction = new HotelBookingPageFunction();
		
		hotelBookingPageFunction.clickOnHotelLnk();
		hotelBookingPageFunction.provideLocality("Indiranagar, Bangalore");
		hotelBookingPageFunction.provideTravelerSelection("1 room, 2 adults");
		hotelBookingPageFunction.clickSearchBtn();
		
		
//		WebDriver driver = new ChromeDriver();   
//		setDriverPath();
//
//        driver.get("https://www.cleartrip.com/");
//        hotelLink.click();
//
//        localityTextBox.sendKeys("Indiranagar, Bangalore");
//
//        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
//        searchButton.click();
//
//        driver.quit();

} }