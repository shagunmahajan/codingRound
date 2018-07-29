package pageFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;
import utility.commonFunction;


public class FlightBookingPageFunction {

	WebDriver driver = new ChromeDriver();

//    private void waitFor(int durationInMilliSeconds) {
//        try {
//            Thread.sleep(durationInMilliSeconds);
//        } catch (InterruptedException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//    }

//    private boolean isElementPresent(By by) {
//        try {
//            driver.findElement(by);
//            return true;
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }
    
    private WebElement oneWayTab = driver.findElement(By.id("OneWay"));
    private WebElement fromTxtBox = driver.findElement(By.id("FromTag"));
    private List<WebElement> fromCityList = driver.findElements(By.id("ui-id-1"));
    private WebElement toTxtBox = driver.findElement(By.id("toTag"));
    private List<WebElement> toCityList = driver.findElements(By.id("ui-id-2"));
    private WebElement date = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a"));
    private WebElement searchBtn = driver.findElement(By.id("SearchBtn"));
    private WebElement searchSummary = driver.findElement(By.className("searchSummary"));
    
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
