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
    public void TestFlyTestCase(){
        driver.get(baseURL);
        FlightSearchPage.FlightTabClick(driver).click();
        FlightSearchPage.FlyingFrom(driver).sendKeys("Istanbul");
        FlightSearchPage.FlyingTo(driver).sendKeys("Ankara");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        FlightSearchPage.FlyDeptDate(driver).sendKeys("12/08/2019");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        FlightSearchPage.FlyReturnDate(driver).sendKeys("08/30/2020");
        FlightSearchPage.FlyTravelers(driver).click();
        FlightSearchPage.FlyTravelersAdult(driver).click();
        FlightSearchPage.FlyTravelersChildren(driver).click();
        FlightSearchPage.FlyClickSearch(driver).click();

    }

    	@Test
        public void TestHotelCase(){
		driver.get(baseURL);
            HotelSearchPage.HotelTabcClick(driver).click();
            HotelSearchPage.getGoingTo(driver).sendKeys("Ankara");
            HotelSearchPage.getCheckIn(driver).sendKeys("12/08/2019");
            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
            HotelSearchPage.getCheckOut(driver).sendKeys("08/30/2020");
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
            HotelSearchPage.HotelTravelers(driver).click();
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
            HotelSearchPage.HotelTravelersAdult(driver).click();
            HotelSearchPage.HotelSearchbutton(driver).click();

        }


    @AfterMethod
    public void afterMethod() {
    }




}
