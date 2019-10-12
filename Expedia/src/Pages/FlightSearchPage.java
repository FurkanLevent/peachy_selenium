package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public static WebElement FlyClickSearch(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[1]/form/div[8]/label/button"));
        return element;
    }
}
