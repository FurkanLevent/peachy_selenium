package Test_Clases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import Pages.HotelSearchPage;
import Pages.FlightSearchPage;


public class TestNG_Search {

    private WebDriver driver;
    private String baseURL;


    @BeforeMethod
    public void setup(){
       System.setProperty("webdriver.chrome.driver", "/Users/furkanleventoturaklioglu/Documents/Selenium/Expedia/src/Drivers/chromedriver");
        baseURL= "https://www.expedia.com";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void TestSearchTestCase(){
        driver.get(baseURL);
        FlightSearchPage.ClickFlightTab(driver).click();
        FlightSearchPage.FlyingFrom(driver).sendKeys("SFO");
        FlightSearchPage.FlyingTo(driver).sendKeys("FLL");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        FlightSearchPage.DeptDate(driver).sendKeys("12/08/2019");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        FlightSearchPage.ReturnDate(driver).sendKeys("08/30/2020");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        FlightSearchPage.ClickSearch(driver).click();

    }

    	@Test
        public void TestHotelSearch(){
		driver.get(baseURL);
            HotelSearchPage.ClickHotelTab(driver).click();
            HotelSearchPage.getGoingTo(driver).sendKeys("FLL");
            HotelSearchPage.getCheckIn(driver).sendKeys("12/08/2019");
            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
            HotelSearchPage.getCheckOut(driver).sendKeys("08/30/2020");
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
            HotelSearchPage.Searchbutton(driver).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        }


    @AfterMethod
    public void afterMethod() {
    }




}
