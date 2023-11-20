package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class InputPage{

    WebDriver driver;

    @FindBy(id="numberofday")
    WebElement noOfDay;

    @FindBy(id = "select")
    WebElement Select1;

    @FindBy(id = "calculate")
    WebElement Calculate;

    public InputPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setInput(String value1) {
        noOfDay.sendKeys(value1);
    }

    public void setType(String value1) {
        Select1.sendKeys(value1);;
    }

    public void clickButton() {
        Calculate.click();
    }
}
