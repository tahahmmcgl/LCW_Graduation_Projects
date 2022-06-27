package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class profilePage {


    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    TouchAction action;

    By checkbox=MobileBy.className("android.widget.RadioButton");
    By textbox=MobileBy.className("android.widget.EditText");
    By passwordbox=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/edtPassword\")");
    By loginbtn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/buttonLogin\")");
    By errMessagee = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/errortextEmail\")");
    By slideDownTxt=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/slideDownText\")");
    By errPassword=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/errortextPassword\")");



    public profilePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
        this.action = new TouchAction(driver);

    }
    public void clickCheckBox(String checkboxName){
        elementHelper.clickElementWithText(checkbox,checkboxName);
    }
    public void writeText(String writingText,String textboxName){
        elementHelper.sendKeyElementWithText(textbox,textboxName,writingText);
    }
    public void clickTextbox(String password){
        elementHelper.sendKey(passwordbox,password);
    }
    public void clickLogin( ) {
        elementHelper.click(loginbtn);
    }
    public void errorMessage(String errMessage){
        elementHelper.checkElementWithText(errMessagee,errMessage);
    }
    public void errorPassword(String errPass){
        elementHelper.checkElementText(errPassword,errPass);
    }
    public void checkSlideDownText(String text){
        elementHelper.checkElementText(slideDownTxt,text);
    }

    public void clickPasswordBox(){
        elementHelper.click(passwordbox);
    }
}

