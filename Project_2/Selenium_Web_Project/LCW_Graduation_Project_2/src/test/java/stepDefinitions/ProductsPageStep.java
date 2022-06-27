package stepDefinitions;

import io.cucumber.java.en.When;
import pages.ProductsPage;
import util.DriverFactory;

public class ProductsPageStep {
    ProductsPage productsPage =new ProductsPage(DriverFactory.getDriver());

    @When("user click {string} to colour filter")
    public void userClickToColourFilter(String colour) {
        productsPage.clickColourFilter(colour);
    }

    @When("user click {string}product")
    public void userClickProduct(String productName) {
        productsPage.productsPageİtem(productName);
    }

    @When("user custom filter top selling")
    public void userCustomFilterTopSelling() {
        productsPage.topSellingFilter();
    }
}
