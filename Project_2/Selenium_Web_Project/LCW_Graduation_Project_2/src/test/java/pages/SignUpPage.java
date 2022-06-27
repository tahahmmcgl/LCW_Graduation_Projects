package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class SignUpPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By signUpPageElement=By.cssSelector("h5.register__title");
    By textBox=By.cssSelector(".text-input");
    By termsAndConditions=By.cssSelector("input.checkbox-input[name=memberPrivacyApprove]");
    By signUpPageBtn=By.cssSelector("div.register :nth-last-child(n) :not(h5)");
    By telephoneVeritification=By.cssSelector("div.confirmation-code-modal__title");
    By checkBox=By.cssSelector("span.checkbox-span");
    By errorTxt=By.cssSelector("div.error");
    String attributeName="placeHolder";
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkSignUpPage(){
        elementHelper.presenceElement(signUpPageElement);
    }
    public void writeToTextBox(String writtenText,String textBoxName){
        elementHelper.sendKeyElementWithAttributeValue(textBox,attributeName,textBoxName,writtenText);
    }
    public void markTermsAndConditions(){
        elementHelper.click(termsAndConditions);
    }
    public void clickSignUpPageButton(String signUpPageButton){
        elementHelper.doubleClickElementWithText(signUpPageBtn,signUpPageButton);
    }
    public void veritificationNotification(){
        elementHelper.presenceElement(telephoneVeritification);
    }
    public void errorMessage(String errorText){
        elementHelper.checkElementText(errorTxt,errorText);
    }
    public void clickCheckBox(String checkBoxName) {
        elementHelper.clickElementWithText(checkBox,checkBoxName);

    }
}
