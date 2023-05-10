import com.codecool.page.IndexPage;
import com.codecool.page.LoginPage;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestLoginUser {

    @Test
    public void successfulLoginUser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSingUpButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        Assert.assertTrue(indexPage.getLoggedInUser().contains("existTester"));

        driver.quit();
    }

    @Test
    public void incorrectLoginUser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSingUpButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.incorrectLogin();

        Assert.assertTrue(loginPage.getErrorMessage().contains("incorrect"));

        driver.quit();
    }
}
