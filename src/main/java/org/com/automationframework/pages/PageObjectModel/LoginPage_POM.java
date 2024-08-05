package org.com.automationframework.pages.PageObjectModel;

import org.com.automationframework.base.commonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.com.automationframework.utils.PropertyReader;

import java.lang.Thread;

public class LoginPage_POM extends commonToAllPage {
    WebDriver driver;
   public LoginPage_POM(){
       super();
    }

    //PAGE LOCATORS
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");


    //PAGE ACTIONS
    public String loginToVWOInvalidCreds() throws InterruptedException {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, "admin");
        clickElement(signButton);
        presenceOfElement(error_message);
        visibilityOfElement(error_message);
        return getElement(error_message).getText();
    }
    public void loginToVWOValidCreds() {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(signButton);

    }
    // Dashboard
    public DashBoardPage_POM afterLoginVWOValidCreds(){
        return new DashBoardPage_POM();
    }
}
