package com.codecool.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    private WebDriver driver;

    @FindBy(css = "input[data-qa='password']")
    private WebElement password;

    @FindBy(css = "select[data-qa='days']")
    private WebElement days;

    @FindBy(css = "select[data-qa='months']")
    private WebElement months;

    @FindBy(css = "select[data-qa='years']")
    private WebElement years;

    @FindBy(id = "newsletter")
    private WebElement newsletter;

    @FindBy(id = "optin")
    private WebElement partners;

    @FindBy(css = "input[data-qa='first_name']")
    private WebElement firstName;

    @FindBy(css = "input[data-qa='last_name']")
    private WebElement lastName;

    @FindBy(css = "input[data-qa='company']")
    private WebElement company;

    @FindBy(css = "input[data-qa='address']")
    private WebElement address;

    @FindBy(css = "input[data-qa='address2']")
    private WebElement address2;

    @FindBy(css = "select[data-qa='country']")
    private WebElement country;

    @FindBy(css = "input[data-qa='state']")
    private WebElement state;

    @FindBy(css = "input[data-qa='city']")
    private WebElement city;

    @FindBy(css = "input[data-qa='zipcode']")
    private WebElement zipcode;

    @FindBy(css = "input[data-qa='mobile_number']")
    private WebElement mobileNumber;

    @FindBy(css = "button[data-qa='create-account']")
    private WebElement createButton;


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setPassword() {
        password.sendKeys("test27password");
    }

    public void setDays() {
        days.sendKeys("1");
    }

    public void setMonths() {
        months.sendKeys("dec");
    }

    public void setYears() {
        years.sendKeys("1996");
    }

    public void clickNewsletter() {
        newsletter.click();
    }

    public void clickPartners() {
        partners.click();
    }

    public void setFirstName() {
        firstName.sendKeys("test27");
    }

    public void setLastName() {
        lastName.sendKeys("test27");
    }

    public void setCompany() {
        company.sendKeys("test27company");
    }

    public void setAddress() {
        address.sendKeys("test27address1");
    }

    public void setAddress2() {
        address2.sendKeys("test27address2");
    }

    public void setCountry() {
        country.sendKeys("un");
    }

    public void setState() {
        state.sendKeys("test27state");
    }

    public void setCity() {
        city.sendKeys("test27city");
    }

    public void setZipcode() {
        zipcode.sendKeys("test27zipcode");
    }

    public void setMobileNumber() {
        mobileNumber.sendKeys("test27mobileNumber");
    }

    public void clickCreateButton() {
        createButton.click();
    }

    public void enterAccountInformation() {
        setPassword();
        setDays();
        setMonths();
        setYears();

        clickNewsletter();
        clickPartners();
        setFirstName();
        setLastName();
        setCompany();
        setAddress();
        setAddress2();
        setCountry();
        setState();
        setCity();
        setZipcode();
        setMobileNumber();

        clickCreateButton();

    }
}
