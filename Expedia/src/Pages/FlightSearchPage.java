package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightSearchPage {

    private static WebElement element;

    public static WebElement FlightTabClick(WebDriver driver){
        element= driver.findElement(By.id("primary-header-flight"));
        return element;
    }

    public static WebElement FlyingFrom(WebDriver driver){
        element = driver.findElement(By.id("flight-origin-flp"));
        return element;
    }

    public static WebElement FlyingTo(WebDriver driver){
        element =driver.findElement(By.id("flight-destination-flp"));
        return element;
    }

    public static WebElement FlyDeptDate(WebDriver driver){
        element = driver.findElement(By.id("flight-departing-flp"));
        return element;
    }

    public static WebElement FlyReturnDate(WebDriver driver){
        element = driver.findElement(By.id("flight-returning-flp"));
        return element;
    }


    public static WebElement FlyTravelers (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"traveler-selector-flp\"]/div/ul/li/button"));
        return element;
    }

    public static WebElement FlyTravelersAdult (WebDriver driver){
        element  = driver.findElement(By.xpath("//*[@id=\"traveler-selector-flp\"]/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button"));
        return element;
    }

    public static WebElement FlyTravelersChildren (WebDriver driver){
       // element  = driver.findElement(By.xpath("//*[@id=\"traveler-selector-flp\"]/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button"));
        Select drpAge = new Select(driver.findElement(By.xpath("//*[@id=\"flight-age-select-1-flp\"]")));
        drpAge.selectByVisibleText("5");
       return element;
    }

    public static WebElement FlyClickSearch(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[1]/form/div[8]/label/button"));
        return element;
    }

}
