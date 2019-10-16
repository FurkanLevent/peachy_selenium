package Test_Clases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import Pages.Search;



public class TestNG_Search {

    private WebDriver driver;
    private String baseURL;


    @BeforeMethod
    public void setup(){
       System.setProperty("webdriver.chrome.driver", "/Users/furkanleventoturaklioglu/Documents/Selenium/Google_Selenium_Automation/src/Drivers/chromedriver");
        baseURL= "https://www.google.com";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void SearchTestCase(){
        driver.get(baseURL);
        Search.SearchBox(driver).sendKeys("Istanbul");
        Search.SearchBtn(driver).click();

    }


    @AfterMethod
    public void afterMethod() {
    }


}
