import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTest {
    private WebDriver driver;
    public static String url = "https://app.e-box.co.in/uploads/31432_index.html";
    public static String result1,result2,result3,h2Element,errorText;

    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:/Users/pagui/Downloads/Driver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        driver.get(url);
    }
    @Test
    public void testWeb() {
        h2Element = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals(h2Element, "Login");
        driver.findElement(By.id("username")).sendKeys("a");
        driver.findElement(By.id("password")).sendKeys("a");
        driver.findElement(By.id("login")).click();
        errorText = driver.findElement(By.id("error")).getText();
        Assert.assertEquals(errorText, "Incorrect username/Password");

        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("username")).sendKeys("john");
        driver.findElement(By.id("password")).sendKeys("john123");
        driver.findElement(By.id("login")).click();

        Actions act = new Actions(driver);
        WebElement likes = driver.findElement(By.id("likes"));
        act.doubleClick(likes).build().perform();
        result1 = driver.findElement(By.id("total")).getText();
        act.doubleClick(likes).build().perform();
        result2 = driver.findElement(By.id("total")).getText();
        act.doubleClick(likes).build().perform();
        result3 = driver.findElement(By.id("total")).getText();
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

}