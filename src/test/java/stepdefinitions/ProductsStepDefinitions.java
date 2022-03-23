package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProductsPage;
import utilities.Driver;

public class ProductsStepDefinitions {
    ProductsPage productsPage=new ProductsPage();
    @Then("Click on Products button")
    public void click_on_products_button() {
        productsPage.productButton.click();
    }
    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(productsPage.allProductsText.isDisplayed());
    }
    @Then("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertEquals(35,productsPage.productList.size());
    }
    @Then("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        productsPage.firstProductviewProductButton.click();
    }
    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        String expectedUrl="https://automationexercise.com/product_details/1";
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());
    }
    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
       productsPage.productInformationList.stream().forEach(t-> Assert.assertTrue(t.isDisplayed()));
    }


}
