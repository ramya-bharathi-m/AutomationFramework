package org.com.automationframework.pages.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.lang.Thread;

public class LoginPage_POM {
    WebDriver driver;
   public LoginPage_POM(){
        driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
    }

    //PAGE LOCATORS
    By username = By.id("login-username");
    By password = By.id("login-password");
    By submitbutton = By.id("js-login-btn");
    By errormsg = By.id("js-notification-box-msg");


    //PAGE ACTIONS
    public String loginNegative() throws InterruptedException {


        driver.findElement(username).sendKeys("admin");
        driver.findElement(password).sendKeys("admin");
        Thread.sleep(5000);
        driver.findElement(submitbutton).click();
//        try{
//            Thread.sleep(5000);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
        return driver.findElement(errormsg).getText();
    }
}
