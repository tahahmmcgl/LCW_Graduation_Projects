package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class PaymentPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By paymentType=By.cssSelector(".paymentTypeName span");
    By postingAddress=By.cssSelector(".addressContainerSubtitle span");
    By cardInformation=By.cssSelector(".sectionTitle.text-center.text-md-left");


    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void selectAddressToPost(String addressName){
        elementHelper.clickElementWithText(postingAddress,addressName);
    }
    public void selectPaymentMethod(String paymentMethod){
        elementHelper.clickElementWithText(paymentType,paymentMethod);
    }
    public void checkPaymentMessage(String message){
        elementHelper.checkElementText(cardInformation,message);
    }
}
