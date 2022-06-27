package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import util.DriverFactory;

public class SignUpPageStep {
    HomePage homePage=new HomePage(DriverFactory.getDriver());
    LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
    SignUpPage signUpPage=new SignUpPage(DriverFactory.getDriver());

    @Then("Check Sign Up Page")
    public void checkSignUpPage() {
        signUpPage.checkSignUpPage();
    }
    @Given("User is Sign Up Page")
    public void userIsSignUpPage() {
        homePage.checkHomePage();
        homePage.clickHeaderButton("Giriş Yap");
        loginPage.checkLoginPage();
        loginPage.clickLoginPageButton("ÜYE OL");
        signUpPage.checkSignUpPage();
    }

    @When("User write {string} to {string} box")
    public void userWriteToBox(String writtenText, String textBoxName) {
        signUpPage.writeToTextBox(writtenText,textBoxName);
    }

    @When("mark Terms and Conditions check box")
    public void markTermsAndConditionsCheckBox() {
        signUpPage.markTermsAndConditions();
    }

    @When("User click sign up page {string} button")
    public void userClickSignUpPageButton(String signUpPageButton) {
        signUpPage.clickSignUpPageButton(signUpPageButton);
    }

    @Then("User should see {string} text")
    public void userShouldSeeText(String veritificationNotification) {
        signUpPage.veritificationNotification();
    }

    @Then("User should see {string} sign up error message")
    public void userShouldSeeSignUpErrorMessage(String errorText) {
        signUpPage.errorMessage(errorText);
    }

    @When("User click {string} check box")
    public void userClickCheckBox(String checkBoxName) {
        signUpPage.clickCheckBox(checkBoxName);
    }
}


