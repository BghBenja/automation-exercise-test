import com.codecool.page.IndexPage;
import com.codecool.page.ProductsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestProducts {

    @Test
    public void allProductsShow() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickProductsButton();

        ProductsPage productsPage = new ProductsPage(driver);

        Assert.assertTrue(productsPage.productsListVisible());

        driver.quit();
    }
}
