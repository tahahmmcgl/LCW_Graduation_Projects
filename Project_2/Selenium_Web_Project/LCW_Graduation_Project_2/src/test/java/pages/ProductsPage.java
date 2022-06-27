package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class ProductsPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By colours= By.cssSelector("span.color-filter-option__text");
    By productList=By.cssSelector("h5.product-card__title");
    By topSellingFilter=By.id("icon-top-selling");
    By colorSearchTextBox=By.cssSelector(".filter-option-search-box__input[placeholder=\"Renk Ara\"]");
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickColourFilter(String colourName){
        elementHelper.sendKey(colorSearchTextBox,colourName);
        elementHelper.clickElementWithText(colours,colourName);
    }
    public void productsPageİtem(String productName){
        elementHelper.clickElementWithText(productList,productName);
    }
    public void topSellingFilter(){
        elementHelper.click(topSellingFilter);
    }
}
