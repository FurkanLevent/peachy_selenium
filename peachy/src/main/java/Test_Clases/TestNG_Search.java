package Test_Clases;

import Pages.mainpage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestNG_Search {

    private WebDriver driver;
    private String baseURL;


    @BeforeMethod
    public void setup(){
       System.setProperty("webdriver.chrome.driver", "/Users/furkanleventoturaklioglu/Documents/Automation/peachy/src/main/java/Drivers/chromedriver");

       //please check google driver for linux environment...
         System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

        baseURL= "http://www.peachy.co.uk";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    @Test
    public void TestPromoCode(){
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
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        mainpage.promocodeInput(driver).sendKeys("5OFF");
       System.out.println("Promation code entered.");

       WebDriverWait wait = new WebDriverWait(driver,60);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("promocode-button")));

        mainpage.promocodeBtn(driver).click();
        mainpage.promocodeBtn(driver).sendKeys(Keys.ENTER) ;

        System.out.println("ACTIVATE (Promationcode Button) button clicked.");

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calc_new_total_payable")));

        mainpage.newtotal(driver);


        String expText = "Total with discount:";
        String pageSource = driver.getPageSource();

        if(pageSource.contains(expText)){
            System.out.println("Expected text '"+expText+"' present in the web page.");
        }else{
            System.out.println("Expected text '"+expText+"' is not present in the web page.");
        }

//        //first way to verify by using locator and getText() method
//        String actNum = driver.findElement(By.id("calc_new_total_payable")).getText();
//        if(actNum.contains(expNum)){
//            System.out.println("Expected total payment '"+expNum+"' present in the web page.");
//        }else{
//            System.out.println("Expected total payment '"+expNum+"' is not present in the web page.");
//        }

    }



    @AfterMethod
    public void afterMethod() {
    }




}
