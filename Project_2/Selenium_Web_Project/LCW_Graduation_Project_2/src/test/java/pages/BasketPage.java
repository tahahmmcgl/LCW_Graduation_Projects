package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class BasketPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By basketPageMsg=By.cssSelector(".col-md-12.cart-header.mb-20 span");
    By productSize=By.cssSelector(".rd-cart-item-size strong");
    By paymentStepBtn=By.cssSelector(".col-md-12.pl-20.pr-20 a");
    By productColour=By.cssSelector(".rd-cart-item-color strong");


    public BasketPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkBasketPage(String basketPageMessage){
        elementHelper.checkElementText(basketPageMsg,basketPageMessage);
    }
    public void checkProductSize(String addedProductSize){
        elementHelper.checkElementText(productSize,addedProductSize);
    }
    public void clickPaymentStepButton(String paymentButtonName){
        elementHelper.clickElementWithText(paymentStepBtn,paymentButtonName);
    }
    public void checkProductColour(String colour){
        elementHelper.checkElementText(productColour,colour);
    }

}
