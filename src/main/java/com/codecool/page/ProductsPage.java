package com.codecool.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    WebDriver driver;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div")
    WebElement productsList;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/h2")
    WebElement productsHeader;

    @FindBy(id = "search_product")
    WebElement productSearchBar;

    @FindBy(id = "submit_search")
    WebElement submitSearchButton;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p")
    WebElement searchedProductText;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a")
    WebElement firstAddProductButton;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a")
    WebElement secondAddProductButton;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]")
    WebElement viewCartButton;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean productsListVisible() {
        return productsList.isDisplayed();
    }

    public String getProductsHeaderText() {
        return productsHeader.getText();
    }

    public void setProductSearchBar(String productName) {
        productSearchBar.sendKeys(productName);
    }

    public void clickSubmitSearchButton() {
        submitSearchButton.click();
    }

    public void searchProduct(String productName) {
        setProductSearchBar(productName);
        clickSubmitSearchButton();
    }

    public String getSearchedProductText() {
        return searchedProductText.getText();
    }

    public void addProducts() {
        scrollDown();
        firstAddProductButton.click();
        continueShoppingButton.click();
        secondAddProductButton.click();
        viewCartButton.click();
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("window.scroll(0,400)");
    }

    public void addProductTwice(){
        scrollDown();
        firstAddProductButton.click();
        continueShoppingButton.click();
        firstAddProductButton.click();
        viewCartButton.click();
    }
}
