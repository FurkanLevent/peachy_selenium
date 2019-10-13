package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HotelSearchPage {

    private static WebElement element;


    public static WebElement HotelTabcClick(WebDriver driver){
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

    public static WebElement HotelTravelers (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"traveler-selector-hlp\"]/div/ul/li/button"));
        return element;
    }

    public static WebElement HotelTravelersAdult (WebDriver driver){
        element  = driver.findElement(By.xpath("//*[@id=\"traveler-selector-hlp\"]/div/ul/li/div/div/div[1]/div[2]/div[2]/button"));
        return element;
    }

    public static WebElement HotelTravelersChildren (WebDriver driver){
      //  element  = driver.findElement(By.xpath("//*[@id=\"traveler-selector-hlp\"]/div/ul/li/div/div/div[1]/div[3]/div[1]/div[4]/button"));
        Select drpAge = new Select(driver.findElement(By.xpath("//*[@id=\"traveler-selector-hlp\"]/div/ul/li/div/div/div[1]/div[3]/div[2]/label[1]/select")));
        drpAge.selectByVisibleText("5");
        return element;
    }

    public static WebElement HotelSearchbutton(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[1]/form/div[11]/label/button"));
        return element;
    }



}
