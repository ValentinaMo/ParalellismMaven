package Tests;

import Pages.HomePage;
import Pages.ResultPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectProductTest extends BaseTest{
    @Test
    public void searchAProduct(){
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        homePage.searchProduct("Televisores");
        ResultPage resultPage = PageFactory.initElements(getDriver(), ResultPage.class);
        resultPage.searchProduct();
    }
    @Test
    public void searchAProductAndSelect(){
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        homePage.searchProduct("Computadores");
        ResultPage resultPage = PageFactory.initElements(getDriver(), ResultPage.class);
        resultPage.searchProduct();
    }

    @Test
    public void searchAProductAndSelect2(){
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        homePage.searchProduct("Relojes");
        ResultPage resultPage = PageFactory.initElements(getDriver(), ResultPage.class);
        resultPage.searchProduct();
    }

    @Test
    public void searchAProductAndSelect3(){
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        homePage.searchProduct("Celulares");
        ResultPage resultPage = PageFactory.initElements(getDriver(), ResultPage.class);
        resultPage.searchProduct();
    }
}
