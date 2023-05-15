package com.codecool.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class IndexPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement singUpButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    WebElement loggedInUser;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement deleteButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement testCasesButton;

    @FindBy(xpath = "//iframe[@id=\"aswift_4\"]")
    WebElement iframe1;

    @FindBy(xpath = "//iframe[@id=\"ad_iframe\"]")
    WebElement iframe2;

    @FindBy(id = "dismiss-button")
    WebElement dismissButton;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
    }

    public void clickSingUpButton() {
        singUpButton.click();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }

    public String getLoggedInUser() {
        return loggedInUser.getText();
    }

    public void clickTestCasesButton() {
        testCasesButton.click();
        switchFrame1();
        switchFrame2();
        clickDismissButton();
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
}
