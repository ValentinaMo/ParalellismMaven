package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected static ThreadLocal<ChromeDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vmoreno\\IdeaProjects\\chromedriver.exe");
        driver.set(new ChromeDriver());
        getDriver().get("https://www.mercadolibre.com.co/");
    }

    public WebDriver getDriver(){
        return driver.get();
    }

    @AfterMethod
    public void tearDown(){
        getDriver().quit();
    }
}
