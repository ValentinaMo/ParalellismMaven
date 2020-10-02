package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {
    private WebDriver driver;
    @FindBy (xpath = "//*[@class=\"ui-search-result__image\"]")
    private WebElement anyProduct;
    @FindBy (xpath = "//*[@class=\"item-title__primary \"]")
    private WebElement nameProductElement;
    @FindBy (xpath = "//*[@class=\"ui-button ui-button--secondary \"]")
    private WebElement addToCartButton;

    public ResultPage(WebDriver driver){
        this.driver = driver;
    }
    public void searchProduct(){
        clickOnWait(5, anyProduct);
    }

    public void addToCart(){
        clickOnWait(10, addToCartButton);
    }

    public void clickOnWait(int timeOut, WebElement element){
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

}
