package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelSearchPage {

    private static WebElement element =null;


    public static WebElement ClickHotelTab(WebDriver driver){
        element=driver.findElement(By.id("primary-header-hotel"));
        return element;
    }

    public static WebElement getGoingTo(WebDriver driver){
        element = driver.findElement(By.id("hotel-destination-hlp"));
        return element;
    }

    public static WebElement getCheckIn(WebDriver driver){
        element = driver.findElement(By.id("hotel-checkin-hlp"));
        return element;
    }

    public static WebElement getCheckOut(WebDriver driver){
        element = driver.findElement(By.id("hotel-checkout-hlp"));
        return element;
    }

    public static WebElement Searchbutton(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[1]/form/div[11]/label/button"));
        return element;
    }
}
