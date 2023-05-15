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
}
