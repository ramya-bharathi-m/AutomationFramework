package org.com.automationframework.basetest;

import org.com.automationframework.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class CommonToAllTest {
    // To call the Start the Webdriver
    // Down the WebDriver
    // Start Webdirver start

    @BeforeMethod
    public void setUP(){
        DriverManager.init();
    }

    // Who will close the Webdriver
    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }

    public void testPrint(){
        System.out.println("From the base class");
    }



}
