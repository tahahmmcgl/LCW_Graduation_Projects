package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class homePageStep {
    pages.homePage homePage=new pages.homePage(DriverFactory.getDriver());

    @Given("User is HomePage")
    public void userIsHomePage() {
        homePage.goHomePage();
    }

    @When("Check HomePage {string} title")
    public void checkHomePageTitle(String title) {
        homePage.checkHomePage(title);
    }

    @When("click {string} navigation button")
    public void clickNavigationButton(String navigationButton) {
        homePage.clickNavigationBtn(navigationButton);
    }


    @When("Check {string} Page")
    public void checkPage(String pageName) {
        homePage.checkProfilePage(pageName);
    }
}
