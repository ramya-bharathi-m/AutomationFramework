package org.com.automationframework.pages.PageFactory;

import org.com.automationframework.base.commonToAllPage;
import org.com.automationframework.pages.PageObjectModel.DashBoardPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.com.automationframework.utils.PropertyReader;

public class LoginPage_PF extends commonToAllPage {
       WebDriver driver;

       public LoginPage_PF(WebDriver driver){
           super();
           PageFactory.initElements(driver,this);
       }

    //PAGE LOCATORS
    @FindBy(id="login-username")
    private WebElement username;

    @FindBy(id="login-password")
    private WebElement password;

    @FindBy(id="js-login-btn")
    private WebElement signButton;

    @FindBy(css = "#js-notification-box-msg")
    private WebElement error_message;

    public String loginToVWOInvalidCreds(){
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, "admin");
        clickElement(signButton);
//        presenceOfElement(error_message);
//        visibilityOfElement(error_message);
        return getElement(null).getText();
    }

    public void loginToVWOValidCreds(){
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(signButton);
    }
    public DashBoardPage_POM afterLoginVWOValidCreds() {
        return new DashBoardPage_POM();
    }



}


