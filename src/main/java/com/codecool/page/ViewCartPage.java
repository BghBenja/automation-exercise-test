package com.codecool.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage {

    WebDriver driver;

    @FindBy(id = "susbscribe_email")
    WebElement subscribeEmailInput;

    @FindBy(id = "subscribe")
    WebElement subscribeButton;

    @FindBy(xpath = "//*[@id=\"success-subscribe\"]/div")
    WebElement successAlert;

    public ViewCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setSubscribeEmailInput(String email){
        subscribeEmailInput.sendKeys(email);
    }

    public void clickSubscribeButton() {
        subscribeButton.click();
    }

    public String getSuccessAlertText() {
        return successAlert.getText();
    }

    public void cartPageSubscription() {
        setSubscribeEmailInput("test27@gmail.com");
        clickSubscribeButton();
    }

}
