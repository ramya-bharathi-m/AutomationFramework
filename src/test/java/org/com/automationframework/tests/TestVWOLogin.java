package org.com.automationframework.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestVWOLogin {

    @Test
    public void login(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
    }
}
