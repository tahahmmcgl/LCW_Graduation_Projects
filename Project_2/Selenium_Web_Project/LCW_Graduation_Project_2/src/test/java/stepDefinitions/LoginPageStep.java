package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import util.DriverFactory;

public class LoginPageStep {
    LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
    HomePage homePage=new HomePage(DriverFactory.getDriver());
    @Then("Check Login Page")
    public void checkLoginPage() {
        loginPage.checkLoginPage();
    }
    @Given("User is Login Page")
    public void userIsLoginPage() {
        homePage.checkHomePage();
        homePage.clickHeaderButton("Giriş Yap");
        loginPage.checkLoginPage();
    }

    @When("User click {string} radio button")
    public void userClickRadioButton(String radioButton) {
        loginPage.clickRadioButton(radioButton);
    }

    @When("User write {string} to {string} login text box")
    public void userWriteToLoginTextBox(String writtenText, String textBoxName) {
        loginPage.writeToTextBox(writtenText,textBoxName);}

    @When("User click login page {string} button")
    public void userClickLoginPageButton(String loginPageButton) {
        loginPage.clickLoginPageButton(loginPageButton);
    }

    @When("User click login page Giriş Yap login button")
    public void userClickLoginPageLoginButton() {
        loginPage.clickLoginPageLoginBtn();}
}
