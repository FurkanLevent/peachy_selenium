package Test_Clases;

import Pages.FlightSearchPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class JUnit_Search {

    private WebDriver driver;
    private String baseURL;
    private int invalidImageCount;


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
        FlightSearchPage.FlightTabClick(driver).click();
        FlightSearchPage.FlyingFrom(driver).sendKeys("Istanbul");
        FlightSearchPage.FlyingTo(driver).sendKeys("Ankara");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        FlightSearchPage.FlyDeptDate(driver).sendKeys("12/08/2019");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        FlightSearchPage.FlyReturnDate(driver).sendKeys("08/30/2020");
        FlightSearchPage.FlyTravelers(driver).click();
        FlightSearchPage.FlyTravelersAdult(driver).click();
        FlightSearchPage.FlyTravelersChildren(driver);
        FlightSearchPage.FlyClickSearch(driver).click();
    }


    @Test
    public void testImages() {
        driver.get(baseURL);
        List<WebElement> l1=driver.findElements(By.tagName("img"));
        //List<WebElement> l2=driver.findElements(By.xpath("//[@type='image']"));
        int count= l1.size();
        System.out.println(count);
    }


    @After
    public void tearDown(){

    }
}
