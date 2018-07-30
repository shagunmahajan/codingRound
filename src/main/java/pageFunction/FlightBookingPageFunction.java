package pageFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.List;
import utility.commonFunction;

public class FlightBookingPageFunction {

	WebDriver driver;
	
	public FlightBookingPageFunction(WebDriver driver){
		// TODO Auto-generated constructor stub	
		this.driver = driver;
    	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "OneWay")
    private WebElement oneWayTab;
    
    @FindBy(id = "FromTag")
    private WebElement fromTxtBox;
    
    @FindBy(xpath = "//*[@id='ui-id-1']//li")
    private List<WebElement> fromCityList;
    
    @FindBy(id = "ToTag")
    private WebElement toTxtBox;
    
    @FindBy(xpath = "//*[@id='ui-id-2']//li")
    private List<WebElement> toCityList;
    
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[7]/a")
    private WebElement date;
    
    @FindBy(id = "SearchBtn")
    private WebElement searchBtn;
    
    @FindBy(className = "searchSummary")
    private WebElement searchSummary;
    
    //click on one way tab
    public void selectOneWayTab() {
    	oneWayTab.click();
    }
    
    //provide value in from city text box
    public void provideFromCity(String fromCity) {
    	fromTxtBox.clear();
    	fromTxtBox.sendKeys(fromCity);
    	commonFunction.waitFor(2000);
    	fromCityList.get(0).click();
    }
    
    //provide value in to city text box
    public void provideToCity(String toCity) {
    	toTxtBox.clear();
    	toTxtBox.sendKeys(toCity);
    	commonFunction.waitFor(2000);
    	toCityList.get(0).click();
    }
    
    //select date
    public void selectDate() {
    	date.click();
    }

    //click on search button
    public void clickOnSearch() {
    	searchBtn.click();
    	commonFunction.waitFor(2000);
    }
    
    //verify search summary is present on the screen
    public void verfiySearchSummary() {
    	Assert.assertTrue(searchSummary.isDisplayed(), "summary is not present");
    }
    
}
