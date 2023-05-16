package com.codecool.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreated {

    private WebDriver driver;

    @FindBy(css = "a[data-qa='continue-button']")
    WebElement continueButton;

    @FindBy(xpath = "//iframe[@id=\"aswift_1\"]")
    WebElement iframe1;

    @FindBy(xpath = "//iframe[@id=\"ad_iframe\"]")
    WebElement iframe2;

    @FindBy(id = "dismiss-button")
    WebElement dismissButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2")
    WebElement accountCreatedHeader;

    public AccountCreated(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void switchFrame1(){
        driver.switchTo().frame(iframe1);
    }

    public void switchFrame2(){
        driver.switchTo().frame(iframe2);
    }

    public void clickDismissButton(){
        dismissButton.click();
    }

    public void confirmAccountCreated(){
        clickContinueButton();
        switchFrame1();
        switchFrame2();
        clickDismissButton();
    }

    public String getAccountCreatedHeaderText() {
        return accountCreatedHeader.getText();
    }
}
