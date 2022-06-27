package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By homePageElement=By.cssSelector(".fast-delivery");
    By headerBtn=By.cssSelector("span.dropdown-label");
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
     public void checkHomePage(){
        elementHelper.presenceElement(homePageElement);
     }
     public void clickHeaderButton(String headerButton){
        elementHelper.clickElementWithText(headerBtn,headerButton);
     }


}
