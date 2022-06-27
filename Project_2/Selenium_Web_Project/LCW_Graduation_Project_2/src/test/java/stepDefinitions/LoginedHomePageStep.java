package stepDefinitions;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.LoginedHomePage;
import util.DriverFactory;


import java.util.Properties;

public class LoginedHomePageStep {

  HomePage homePage=new HomePage(DriverFactory.getDriver());
  LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
  LoginedHomePage loginedHomePage=new LoginedHomePage(DriverFactory.getDriver());
  String LoginName="TrueEmail@gmail.com";
  String password="TruePassword";

    @Then("User should see {string} header button in logined HomePage")
    public void userShouldSeeHeaderButtonInLoginedHomePage(String headerButtonName) {
        loginedHomePage.checkLoginedHomePage(headerButtonName);
    }

    @Given("User is Logined Home Page")
    public void userIsLoginedHomePage() {
      homePage.checkHomePage();
      homePage.clickHeaderButton("Giriş Yap");
      loginPage.checkLoginPage();
      loginPage.clickRadioButton("E-Posta");
      loginPage.writeToTextBox(LoginName,"E-Posta Adresiniz");
      loginPage.writeToTextBox(password,"Şifreniz");
      loginPage.clickLoginPageLoginBtn();
      loginedHomePage.checkLoginedHomePage("Hesabım");
    }

    @When("Click on the {string} product from the {string} submenu in the {string} menu")
    public void clickOnTheProductFromTheSubmenuInTheMenu(String productName, String subMenuName, String menuName) {
      loginedHomePage.clickProductMenu(productName,subMenuName,menuName);
    }
}
