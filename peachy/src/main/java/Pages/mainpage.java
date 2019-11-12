package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class mainpage {

    private static WebElement element;

    public static WebElement promocodeInput(WebDriver driver){
        element= driver.findElement(By.id("promocode"));
        return element;
    }

    public static WebElement promocodeBtn(WebDriver driver){
        WebElement element = driver.findElement(By.id("promocode-button"));
        return element;
    }

    public static WebElement newtotal(WebDriver driver){
        List<WebElement> dynamicElement = driver.findElements(By.id("calc_new_total_payable"));

        System.out.println("Printing " + element.getText() + "" );

        if(dynamicElement.size() != 0){
            //If list size is non-zero, element is present
            System.out.println("new total payment present in the page.");
        }
        else{
            //Else if size is 0, then element is not present
            System.out.println("new total payment not present in the page.");
        }
        return element;

    }

    public static WebElement largeBtn(WebDriver driver){
        element= driver.findElement(By.className("large button"));
        return element;
    }



}






