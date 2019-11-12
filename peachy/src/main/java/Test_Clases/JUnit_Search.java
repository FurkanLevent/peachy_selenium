package Test_Clases;

import Pages.mainpage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class JUnit_Search {

    private WebDriver driver;
    private String baseURL;
    private int invalidImageCount;


    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/furkanleventoturaklioglu/Documents/Automation/peachy/src/main/java/Drivers/chromedriver");
        baseURL= "https://www.peachy.co.uk";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testFlightSearch(){
        driver.get(baseURL);
        System.out.println("https://www.peachy.co.uk page has been opened successfully..");
        String expectedTitle = "Short Term Loans and Payday Loans up to £1,000 at Peachy";
        System.out.println(expectedTitle);

        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle))
        {
            System.out.println("Verification Successful - The correct title is displayed on the web page.");
        }
        else
        {
            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
        }

        WebDriverWait wait = new WebDriverWait(driver,30);
        mainpage.promocodeInput(driver).sendKeys("5OFF");
        System.out.println("Promation code entered.");

        mainpage.promocodeBtn(driver).click();
        System.out.println("ACTIVATE (Promationcode Button) button clicked.");

        mainpage.newtotal(driver);

        String expText = "Total with discount:";
        String pageSource = driver.getPageSource();

        if(pageSource.contains(expText)){
            System.out.println("Expected text '"+expText+"' present in the web page.");
        }else{
            System.out.println("Expected text '"+expText+"' is not present in the web page.");
        }
    }



    @After
    public void tearDown(){

    }
}
