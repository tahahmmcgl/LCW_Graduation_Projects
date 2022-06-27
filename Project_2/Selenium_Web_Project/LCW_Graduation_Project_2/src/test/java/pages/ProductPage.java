package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By productSizes=By.cssSelector(".option-size a:nth-child(n)");
    By basketProductCount=By.cssSelector("span.badge-circle");
    By addBasketButton=By.cssSelector(".add-to-cart.button-link.add-to-cart-button");
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void selectSize(String size){
        elementHelper.clickElementWithText(productSizes,size);
    }
    public void addBasketProduct(){
        elementHelper.click(addBasketButton);
    }
    public void basketHeaderButtonCount(String count){
        elementHelper.checkElementText(basketProductCount,count);
    }
}
