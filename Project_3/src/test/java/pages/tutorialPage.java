package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;


public class tutorialPage {


    By tvTutorial = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/ivTutorial\")");
    By tutorialText = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/textView\")");
    By tutorialTitle = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvTitle\")");
    By tutorialDescriptionTitle = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvContent\")");
    By tutorialButtonName = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvNext\")");
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    TouchAction action;

    public tutorialPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
        this.action = new TouchAction(driver);

    }


    public void checkHomePage() {
        elementHelper.checkElementPresence(tutorialTitle);
    }

    public void seeTvTutorial() {
        elementHelper.checkElementPresence(tvTutorial);
    }

    public void seeText(String text) {
        elementHelper.checkElementText(tutorialText, text);
    }

    public void seeTitle(String title) {
        elementHelper.checkElementWithText(tutorialTitle, title);
    }

    public void seeDescriptionTitle(String descriptionTitle) {
        driver.findElement(tutorialDescriptionTitle).getText().contains(descriptionTitle);
    }

    public void clickButton(String buttonName) {
        elementHelper.clickElementWithText(tutorialButtonName, buttonName);
    }
}
