package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Search {

    private static WebElement element;

    public static WebElement SearchBox (WebDriver driver){
        element= driver.findElement(By.name("q"));
        //element.sendKeys(Keys.ENTER);
        //element.submit();

        return element;

    }
    public static WebElement SearchBtn (WebDriver driver) {
        element = driver.findElement(By.name("btnK"));
        return element;

    }
}
