package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaymentPage;
import util.DriverFactory;

public class PaymentPageStep {
PaymentPage paymentPage=new PaymentPage(DriverFactory.getDriver());

    @When("User select {string} address to post address")
    public void userSelectAddressToPostAddress(String postAddress) {
        paymentPage.selectAddressToPost(postAddress);
    }

    @When("User select {string} payment method")
    public void userSelectPaymentMethod(String paymentMethod) {
        paymentPage.selectPaymentMethod(paymentMethod);
    }

    @Then("User check {string} payment message")
    public void userCheckPaymentMessage(String paymentMessage) {
        paymentPage.checkPaymentMessage(paymentMessage);
    }
}
