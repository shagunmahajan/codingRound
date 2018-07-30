package pageFunction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HotelBookingPageFunction {

	WebDriver driver;

	public HotelBookingPageFunction(WebDriver driver) {
		this.driver = driver;
	}
	
    private WebElement hotelLink = driver.findElement(By.linkText("Hotels"));
    private WebElement localityTextBox = driver.findElement(By.id("Tags"));
    private WebElement searchButton = driver.findElement(By.id("SearchHotelsButton"));
    private WebElement travelerSelection = driver.findElement(By.id("travellersOnhome"));
    
    //click on hotel link
    public void clickOnHotelLnk() {
    	hotelLink.click();
    }
    
    //provide locality
    public void provideLocality(String locality) {
    	localityTextBox.sendKeys(locality);
    }

    //provide traveler selection
    public void provideTravelerSelection(String selection) {
    	new Select(travelerSelection).selectByVisibleText(selection);
    }
    
    //click on search button
    public void clickSearchBtn() {
    	searchButton.click();
    }
    
}
