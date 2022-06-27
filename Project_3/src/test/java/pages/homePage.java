package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import util.ElementHelper;

import java.util.List;


public class homePage {


    By tutorialButtonName = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvNext\")");
    By firstTitle = MobileBy.id("com.lcwaikiki.android:id/txtWelcomeHeader");
    By navigationBtn = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/textItemTab\")");
    By pageNames = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/textviewTitleAccount\")");
    AppiumDriver driver;

    WebDriverWait wait;
    ElementHelper elementHelper;
    TouchAction action;


    public homePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
        this.action = new TouchAction(driver);


    }

    public void goHomePage() {
        driver.findElement(tutorialButtonName).click();
    }

    public void checkHomePage(String title) {
        //elementHelper.checkElementWithText(firstTitle, title);
        boolean val = false;

        if (driver.findElement(firstTitle).getText().equals(title)) {
            val = true;
        }
        Assert.assertTrue(val);
    }

    public void clickNavigationBtn(String navigationButton) {
        // elementHelper.clickElementWithText(navigationBtn,navigationButton);
        boolean val = false;
        List<WebElement> elements = driver.findElements(navigationBtn);
        for (WebElement webElement : elements) {
            if (webElement.getText().equals(navigationButton)){
                webElement.click();
                val=true;
                break;
            }
        }
        Assert.assertTrue(val);
    }


    public void checkProfilePage(String pageName) {
        //elementHelper.clickElementWithText(pageNames, pageName);
        boolean val = false;
        List<WebElement> elements = driver.findElements(pageNames);
        for (WebElement webElement : elements) {
            if (webElement.getText().equals(pageName)){
                webElement.click();
                val=true;
                break;
            }
        }
        Assert.assertTrue(val);
    }
}