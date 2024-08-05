package org.com.automationframework.tests;

import org.com.automationframework.pages.PageObjectModel.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.com.automationframework.basetest.CommonToAllTest;

public class TestVWOLogin extends CommonToAllTest {

    @Test
    public void loginNegative() throws InterruptedException {
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        String errortextmsg = loginPagePom.loginToVWOInvalidCreds();
        Assert.assertEquals(errortextmsg,"Your email, password, IP address or location did not match");

    }
}
