package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    @FindBy (xpath = "//*[@class=\"nav-search-input\"]")
    private WebElement searchBarField;
    @FindBy (xpath = "//*[@class=\"nav-icon-search\"]")
    private WebElement searchButton;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void searchProduct(String product){
        sendKeyWait(15, product, searchBarField);
        clickOnWait(5, searchButton);

    }

    public void clickOnWait(int timeOut, WebElement element){
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void sendKeyWait(int timeOut, String value, WebElement locator) {
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(locator));
        locator.sendKeys(value);
    }
}
