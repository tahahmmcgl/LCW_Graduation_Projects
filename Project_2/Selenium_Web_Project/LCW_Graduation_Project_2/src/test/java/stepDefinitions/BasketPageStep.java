package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasketPage;
import util.DriverFactory;

public class BasketPageStep {
    BasketPage basketPage=new BasketPage(DriverFactory.getDriver());

    @Then("User should see {string} basket message")
    public void userShouldSeeBasketMessage(String basketMessage) {
        basketPage.checkBasketPage(basketMessage);
    }

    @Then("User should see product size {string}")
    public void userShouldSeeProductSize(String addedProductSize) {
        basketPage.checkProductSize(addedProductSize);
    }

    @When("User click {string} payment step button")
    public void userClickPaymentStepButton(String paymentStepButton) {
        basketPage.clickPaymentStepButton(paymentStepButton);
    }

    @Then("User should see {string} colour added product")
    public void userShouldSeeColourAddedProduct(String colour) {
        basketPage.checkProductColour(colour);
    }
}
