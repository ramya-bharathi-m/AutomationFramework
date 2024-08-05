package org.com.automationframework.base;

import org.com.automationframework.driver.DriverManager;
import org.com.automationframework.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.com.automationframework.driver.DriverManager.getDriver;


public class commonToAllPage {
    public commonToAllPage(){

    }

    // If you want to call something before every Page Object Class call,
    // Put your Code here");
    // Open File, Open Data Base Connection You can write code here
    // This is common to all pages

    /* We can add common functionalities like
     *
     * Wait -> Implicit, Explicit, Fluent
     * Click
     * Entering Input
     * Explicit conditions like Waitforanelement, visibilityofelement etc
     *
     */
    public void openVWOLoginURL(){

        getDriver().get(PropertyReader.readKey("url"));
    }

    public void clickElement(By by){
        getDriver().findElement(by).click();
    }
    public void clickElement(WebElement by){
        by.click();
    }

    public void enterInput(By by,String key){
        getDriver().findElement(by).sendKeys(key);
    }
    public void enterInput(WebElement element,String key){
        element.sendKeys(key);
    }

    //WAIT EXPLICIT

    public WebElement presenceOfElement( By elementLocation){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By elementLocation){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    public WebElement getElement(By key){
        return getDriver().findElement(key);
    }
}
