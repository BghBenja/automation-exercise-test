import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterUser {

    @Test
    public void successfulRegistration(){
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

        By userPassword = By.id("password");

        By daySelect = By.id("days");

        By dayOption = By.xpath("//*[@id=\"days\"]/option[2]");

        By monthSelect = By.id("months");

        By monthOption = By.xpath("//*[@id=\"months\"]/option[2]");

        By yearSelect = By.id("years");

        By yearOption = By.xpath("//*[@id=\"years\"]/option[2]");

        By newsletterCheckbox = By.id("newsletter");

        By partnersCheckbox = By.id("optin");

        driver.findElement(userPassword).sendKeys("kacsa");

        driver.findElement(daySelect).click();

        driver.findElement(dayOption).click();

        driver.findElement(monthSelect).click();

        driver.findElement(monthOption).click();

        driver.findElement(yearSelect).click();

        driver.findElement(yearOption).click();

        driver.findElement(newsletterCheckbox).click();

        driver.findElement(partnersCheckbox).click();

        //driver.quit();
        
    }
}
