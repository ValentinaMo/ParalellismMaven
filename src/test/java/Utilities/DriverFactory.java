package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private WebDriver driver;


    public void setUpWebDriver(String url){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public WebDriver getWebDriver(String url){
        if(driver == null){
            setUpWebDriver(url);
        }
        return driver;
    }

}
