package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayPage {

    WebDriver driver;
    //fill your code
    @FindBy(tagName = "h2")
    WebElement h2;

    @FindBy(id = "result")
    WebElement result;

    public DisplayPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getH2tag() {
        return h2.getText();

    }

    public String getResult() {
        return result.getText();
    }
}
