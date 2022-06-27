package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import javax.swing.*;

public class LoginedHomePage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By headerElement= By.cssSelector(".dropdown-label");
    By menuList=By.cssSelector(".menu-header-item__title");
    By subMenuList=By.cssSelector("a.zone-header__anchor");
    By menuActiveItem=By.cssSelector(".menu-header-item.menu-header-item--active");
    By productNameList=By.cssSelector(".zone-item a");
    public LoginedHomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkLoginedHomePage(String headerElementName){
        elementHelper.checkElementText(headerElement,headerElementName);
    }
    public void clickProductMenu(String productName, String subMenuName, String menuName){
        elementHelper.moveToElementWithText(menuList,menuName);
        elementHelper.presenceElement(menuActiveItem);
        elementHelper.checkElementWithText(subMenuList,subMenuName);
        elementHelper.clickElementWithText(productNameList,productName);
    }
}
