package org.com.automationframework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    @BeforeMethod
    public static void init(){
        if(driver == null){
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start--maximized");
            options.addArguments("--guest");
            driver = new EdgeDriver(options);
        }
    }

    @AfterMethod
    public static void down(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
