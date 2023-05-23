import com.codecool.page.IndexPage;
import com.codecool.page.ViewCartPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestSubscription {

    @Test
    public void verifyHomePageSubscription() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        IndexPage indexPage = new IndexPage(driver);
        indexPage.homePageSubscription();

        Assert.assertTrue(indexPage.getSuccessAlertText().contains("You have been successfully subscribed!"));

        driver.quit();
    }

    @Test
    public void verifyCarPageSubscription() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickCartButton();

        ViewCartPage viewCartPage = new ViewCartPage(driver);
        viewCartPage.cartPageSubscription();

        Assert.assertTrue(indexPage.getSuccessAlertText().contains("You have been successfully subscribed!"));

        driver.quit();
    }
}
