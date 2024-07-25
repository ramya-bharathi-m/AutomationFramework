package org.com.automationframework.tests;

import org.com.automationframework.pages.PageObjectModel.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin {

    @Test
    public void login() throws InterruptedException {
        LoginPage_POM loginPagePom = new LoginPage_POM();
        String errortextmsg = loginPagePom.loginNegative();
        Assert.assertEquals(errortextmsg,"Your email, password, IP address or location did not match");

    }
}
