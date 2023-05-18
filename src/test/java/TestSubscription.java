import com.codecool.page.IndexPage;
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
}
