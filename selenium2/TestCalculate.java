package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import pages.InputPage;
import pages.DisplayPage;

public class TestCalculate {
    WebDriver driver;
    public static String url="https://app.e-box.co.in/uploads/31431_index.html";
    public static String h2Element,result1,result2,result3,result4;
    InputPage inputPage;
    DisplayPage displayPage;

    @BeforeTest
    public void launchDriver() {
        driver = new FirefoxDriver();
        driver.get(url);
        inputPage = new InputPage(driver);
        displayPage = new DisplayPage(driver);
    }

    //fill your code
    @Test(priority=1)
    public void test01() {
        h2Element = displayPage.getH2tag();
        assert h2Element.equals("Events Cost Calculation");

        inputPage.setType("Corporate Event");
        inputPage.setInput("5");
        inputPage.clickButton();
        result1 = displayPage.getResult();
        assert result1.equals("Total cost is $200000");
        driver.navigate().refresh();
    }

    @Test(priority=2)
    public void test02() {
        inputPage.setType("Wedding Event");
        inputPage.setInput("2");
        inputPage.clickButton();
        result2 = displayPage.getResult();
        assert result2.equals("Total cost is $20000");
        driver.navigate().refresh();
    }

    @Test(priority=3)
    public void test03() {
        inputPage.setType("Social Event");
        inputPage.setInput("3");
        inputPage.clickButton();
        result3  = displayPage.getResult();
        assert result3.equals("Total cost is $16000");
        driver.navigate().refresh();
    }

    @Test(priority=4)
    public void test04() {
        inputPage.setType("College Event");
        inputPage.setInput("4");
        inputPage.clickButton();
        assert result4.equals("");
        result4  = displayPage.getResult();

    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}
