package com.codecool.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccount {

    WebDriver driver;

    @FindBy(css = "a[data-qa='continue-button']")
    WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2")
    WebElement deleteAccountHeader;

    public DeleteAccount(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public String getDeleteAccountHeaderText() {
        return deleteAccountHeader.getText();
    }
}
