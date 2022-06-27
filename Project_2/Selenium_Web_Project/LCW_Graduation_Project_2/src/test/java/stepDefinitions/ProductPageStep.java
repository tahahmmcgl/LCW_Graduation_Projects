package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import util.DriverFactory;

public class ProductPageStep {
    ProductPage productPage=new ProductPage(DriverFactory.getDriver());
    @When("user select {string} size of product")
    public void userSelectSizeOfProduct(String size) {
        productPage.selectSize(size);
    }

    @When("User add basket product")
    public void userAddBasketProduct() {
        productPage.addBasketProduct();
    }

    @Then("Basket header button counts should be {string}")
    public void basketHeaderButtonCountsShouldBe(String count) {
        productPage.basketHeaderButtonCount(count);
    }
}
