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

    @FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[1]/ol/li[2]")
    WebElement shoppingCartText;

    @FindBy(xpath = "//*[@id=\"product-1\"]/td[2]/h4/a")
    WebElement firstCartProductText;

    @FindBy(xpath = "//*[@id=\"product-2\"]/td[2]/h4/a")
    WebElement secondCarteProductText;

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

    public String getShoppingCartText() {
        return shoppingCartText.getText();
    }

    public String getFirstCartProduct() {
        return firstCartProductText.getText();
    }

    public String getSecondCartProduct() {
        return secondCarteProductText.getText();
    }

}
