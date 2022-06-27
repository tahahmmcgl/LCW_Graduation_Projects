package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import pages.profilePage;
import util.DriverFactory;

public class profilePageStep {
    pages.homePage homePage=new homePage(DriverFactory.getDriver());
    pages.profilePage profilePage=new profilePage(DriverFactory.getDriver());

    @Given("User is Profile Page")
    public void userIsProfilePage() {
        homePage.goHomePage();
        homePage.checkHomePage("Hoş geldin");
        homePage.clickNavigationBtn("Profil");

    }


    @When("click {string} check box")
    public void clickCheckBox(String checkboxName) {
        profilePage.clickCheckBox(checkboxName);
    }

    @When("write {string} in {string} textbox")
    public void writeInTextbox(String writingIn, String textboxName) {
        profilePage.writeText(writingIn,textboxName);
    }

    @When("write {string} in password textbox")
    public void clickTextbox(String password ) {
        profilePage.clickTextbox(password);
    }

    @Then("you should see {string} message")
    public void youShouldSeeMessage(String message) {
    profilePage.errorMessage(message);
    }

    @When("click login button")
    public void clickButton( ) {
        profilePage.clickLogin();
    }

    @Then("you should see {string} slide down text")
    public void youShouldSeeSlideDownText(String slideDownText) {
        profilePage.checkSlideDownText(slideDownText);
    }

    @Then("you should see {string} password error message")
    public void youShouldSeePasswordErrorMessage(String errPassword) {
    profilePage.errorPassword(errPassword);
    }

    @When("click password box")
    public void clickPasswordBox() {
        profilePage.clickPasswordBox();
    }
}
