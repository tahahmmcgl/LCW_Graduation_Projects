package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By loginPageElement= By.cssSelector("h5.login-form__title");
    By loginPageBtn= By.cssSelector("div.login-form form :nth-child(n)");
    By textBox=By.cssSelector("input.text-input");
    By radioBtn=By.cssSelector("span.login-form__radio-buttons--span");
    By loginBtn=By.cssSelector(".login-form__button.login-form__button--bg-blue");
    String attributeName="placeHolder";
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkLoginPage(){
        elementHelper.presenceElement(loginPageElement);
    }
    public void clickLoginPageButton(String loginPageButton){
        elementHelper.clickElementWithText(loginPageBtn,loginPageButton);
    }
    public void clickRadioButton(String radioButton){
        elementHelper.clickElementWithText(radioBtn,radioButton);
    }
    public void writeToTextBox(String writtenText,String textboxName){
        elementHelper.sendKeyElementWithAttributeValue(textBox,attributeName,textboxName,writtenText);
    }
    public void clickLoginPageLoginBtn(){
        elementHelper.click(loginBtn);
    }
}
