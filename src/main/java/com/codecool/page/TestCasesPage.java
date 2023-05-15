package com.codecool.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasesPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div[1]/div/h2/b")
    WebElement headerText;

    public TestCasesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText() {
        return headerText.getText();
    }
}
