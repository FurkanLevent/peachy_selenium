package Test_Clases;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.FlightSearchPage;
import Pages.HotelSearchPage;


public class JUnit_Search {

    private WebDriver driver;
    private String baseURL;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/furkanleventoturaklioglu/Documents/Selenium/Expedia/src/Drivers/chromedriver");
        baseURL= "https://www.expedia.com";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testFlightSearch(){
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

    @After
    public void tearDown(){

    }
}
