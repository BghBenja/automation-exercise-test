package com.codecool.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(css = "input[data-qa='signup-name']")
    WebElement signupName;

    @FindBy(css = "input[data-qa='signup-email']")
    WebElement signupEmail;

    @FindBy(css = "button[data-qa='signup-button']")
    WebElement singUpButton;

    @FindBy(css = "input[data-qa='login-email']")
    WebElement loginEmail;

    @FindBy(css = "input[data-qa='login-password']")
    WebElement loginPassword;

    @FindBy(css = "button[data-qa='login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/p")
    WebElement errorMessage;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserName() {
        signupName.sendKeys("test27");
    }

    public void setUserEmail() {
        signupEmail.sendKeys("test27@gmail.com");
    }

    public void clickSingUpButton() {
        singUpButton.click();
    }

    public void signUp() {
        setUserName();
        setUserEmail();
        clickSingUpButton();
    }

    public void setLoginEmail(String email){
        loginEmail.sendKeys(email);
    }

    public void setLoginPassword(String password){
        loginPassword.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void login(){
        setLoginEmail("existTester@gmail.com");
        setLoginPassword("existTesterPassword");
        clickLoginButton();
    }

    public String getErrorMessage(){
        return errorMessage.getText();
    }

    public void incorrectLogin(){
        setLoginEmail("incorrectTester@gmail.com");
        setLoginPassword("incorrectTesterPassword");
        clickLoginButton();
    }


}
