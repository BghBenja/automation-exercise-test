package com.codecool.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(css = "input[data-qa='signup-name']")
    WebElement userName;

    @FindBy(css = "input[data-qa='signup-email']")
    WebElement userEmail;

    @FindBy(css = "button[data-qa='signup-button']")
    WebElement singUpButton;

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserName(){
        userName.sendKeys("test27");
    }

    public void setUserEmail(){
        userEmail.sendKeys("test27@gmail.com");
    }

    public void clickSingUpButton(){
        singUpButton.click();
    }

    public void signUp(){
        setUserName();
        setUserEmail();
        clickSingUpButton();
    }


}
