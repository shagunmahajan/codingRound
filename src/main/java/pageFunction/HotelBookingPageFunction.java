package pageFunction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HotelBookingPageFunction {

	WebDriver driver = new ChromeDriver();

//    @FindBy(linkText = "Hotels")
//    private WebElement hotelLink;
//
//    @FindBy(id = "Tags")
//    private WebElement localityTextBox;
//
//    @FindBy(id = "SearchHotelsButton")
//    private WebElement searchButton;
//
//    @FindBy(id = "travellersOnhome")
//    private WebElement travellerSelection;

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
