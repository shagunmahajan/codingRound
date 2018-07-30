package pageFunction;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.commonFunction;

public class HotelBookingPageFunction {

	WebDriver driver;
	
	public HotelBookingPageFunction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	  @FindBy(linkText = "Hotels")
	  private WebElement hotelLink;
	
	  @FindBy(id = "Tags")
	  private WebElement localityTextBox;
	
	  @FindBy(id = "SearchHotelsButton")
	  private WebElement searchButton;
	
	  @FindBy(id = "travellersOnhome")
	  private WebElement travelerSelection;
	  
	  @FindBy(xpath = "//*[@id='ui-id-1']//li[@class='list']")
	  private List<WebElement> localityList;
	
    //click on hotel link
    public void clickOnHotelLnk() {
    	hotelLink.click();
    }
    
    //provide locality
    public void provideLocality(String locality) {
    	//localityTextBox.clear();
    	localityTextBox.sendKeys(locality);
    	commonFunction.waitFor(1500);
    	localityList.get(0).click();
    }

    //provide traveler selection
    public void provideTravelerSelection(String selection) {
    	new Select(travelerSelection).selectByVisibleText(selection);
    }
    
    //click on search button
    public void clickSearchBtn() {
    	searchButton.click();
    	commonFunction.waitFor(1000);
    }
    
}
