package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import util.DriverFactory;

import java.util.Properties;

public class HomePageStep {
    HomePage homePage=new HomePage(DriverFactory.getDriver());
    Properties properties=new Properties();
    @Given("User is HomePage")
    public void userIsHomePage(){
        homePage.checkHomePage();
    }

    @When("User click {string} Header Button")
    public void userClickHeaderButton(String headerButton) {
        homePage.clickHeaderButton(headerButton);
    }
}
