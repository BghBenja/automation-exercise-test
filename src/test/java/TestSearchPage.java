import com.codecool.page.IndexPage;
import com.codecool.page.LoginPage;
import com.codecool.page.TestCasesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestSearchPage {

    @Test
    public void verifyTestCasesPage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickTestCasesButton();

        TestCasesPage testCasesPage = new TestCasesPage(driver);
        Assert.assertTrue(testCasesPage.getHeaderText().contains("TEST"));

        driver.quit();
    }

    @Test
    public void verifyIndexPage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        IndexPage indexPage = new IndexPage(driver);

        Assert.assertTrue(indexPage.getHomeButtonText().contains("Home"));

        driver.quit();
    }

    @Test
    public void verifyLoginPage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSingUpButton();

        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(loginPage.getLoginHeading().contains("Login"));

        driver.quit();
    }

    @Test
    public void verifyAccountInformationPage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSingUpButton();

        LoginPage loginSignUpPage = new LoginPage(driver);
        loginSignUpPage.signUp();

        Assert.assertTrue(loginSignUpPage.getAccountInformationText().contains("ENTER ACCOUNT INFORMATION"));

        driver.quit();
    }
}
