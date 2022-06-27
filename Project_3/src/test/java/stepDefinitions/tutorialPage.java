package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class tutorialPage {

    pages.tutorialPage tutorialPage = new pages.tutorialPage(DriverFactory.getDriver());


    @Given("User is opened LcWaikiki App")
    public void enesIsOpenedLcWaikikiApp() {
        tutorialPage.checkHomePage();
    }

    @Then("should see TvTutorial")
    public void shouldSeeTvTutorial() {
        tutorialPage.seeTvTutorial();
    }

    @Then("should see {string} text")
    public void shouldSeeText(String text) {
        tutorialPage.seeText(text);
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String title) {
        tutorialPage.seeTitle(title);
    }

    @Then("should see {string} title description")
    public void shouldSeeTitleDescription(String descriptionTitle) {
        tutorialPage.seeDescriptionTitle(descriptionTitle);
    }

    @Then("click {string} footer button")
    public void shouldSeeButton(String buttonName) {
        tutorialPage.clickButton(buttonName);
    }

}