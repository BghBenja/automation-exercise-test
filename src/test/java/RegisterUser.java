import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterUser {

    @Test
    public void successfulRegistration() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();

        By singUpButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");

        driver.findElement(singUpButton).click();

        By userName = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");

        By userEmail = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");

        By singUp = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

        driver.findElement(userName).sendKeys("test27");

        driver.findElement(userEmail).sendKeys("test27@gamil.com");

        driver.findElement(singUp).click();

        //ENTER ACCOUNT INFORMATION

        By userPassword = By.id("password");

        By daySelect = By.id("days");

        By dayOption = By.xpath("//*[@id=\"days\"]/option[2]");

        By monthSelect = By.id("months");

        By monthOption = By.xpath("//*[@id=\"months\"]/option[2]");

        By yearSelect = By.id("years");

        By yearOption = By.xpath("//*[@id=\"years\"]/option[2]");

        By newsletterCheckbox = By.id("newsletter");

        By partnersCheckbox = By.id("optin");

        driver.findElement(userPassword).sendKeys("testPassword");

        driver.findElement(daySelect).click();

        driver.findElement(dayOption).click();

        driver.findElement(monthSelect).click();

        driver.findElement(monthOption).click();

        driver.findElement(yearSelect).click();

        driver.findElement(yearOption).click();

        driver.findElement(newsletterCheckbox).click();

        driver.findElement(partnersCheckbox).click();

        //ADDRESS INFORMATION

        By userFirstName = By.id("first_name");

        By userLastName = By.id("last_name");

        By userCompany = By.id("company");

        By userAddress1 = By.id("address1");

        By userAddress2 = By.id("address2");

        By countrySelect = By.id("country");

        By countryOption = By.xpath("//*[@id=\"country\"]/option[2]");

        By userState = By.id("state");

        By userCity = By.id("city");

        By userZipcode = By.id("zipcode");

        By userMobileNumber = By.id("mobile_number");

        By createButton = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button");

        driver.findElement(userFirstName).sendKeys("test");

        driver.findElement(userLastName).sendKeys("27");

        driver.findElement(userCompany).sendKeys("testCompany");

        driver.findElement(userAddress1).sendKeys("testAddress1");

        driver.findElement(userAddress2).sendKeys("testAddress2");

        driver.findElement(countrySelect).click();

        driver.findElement(countryOption).click();

        driver.findElement(userState).sendKeys("testState");

        driver.findElement(userCity).sendKeys("testCity");

        driver.findElement(userZipcode).sendKeys("testZipcode");

        driver.findElement(userMobileNumber).sendKeys("testMobileNumber");

        driver.findElement(createButton).click();

        //ACCOUNT CREATED!

        By continueCreateButton = By.xpath("//*[@id=\"form\"]/div/div/div/div/a");

        driver.findElement(continueCreateButton).click();

        Thread.sleep(5000);

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id=\"aswift_1\"]"));
        ///html/ins/div/iframe

        driver.switchTo().frame(frame1);

        WebElement frame2 = driver.findElement(By.xpath("//iframe[@id=\"ad_iframe\"]"));

        driver.switchTo().frame(frame2);

        By addButton = By.xpath("//div[@id=\"dismiss-button\"]");

        driver.findElement(addButton).click();

        By deleteButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");

        driver.findElement(deleteButton).click();

        By continueDeleteButton = By.xpath("//*[@id=\"form\"]/div/div/div/div/a");

        driver.findElement(continueDeleteButton).click();

        driver.quit();
        
    }
}
