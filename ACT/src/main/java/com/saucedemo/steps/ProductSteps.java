package com.saucedemo.steps;

import com.saucedemo.pages.ProductPage;
import io.cucumber.java.en.When;

public class ProductSteps {
    ProductPage productPage;

    public ProductSteps() {
        productPage = new ProductPage(Hooks.driver);
    }

    @When("eu ordeno os produtos por {string}")
    public void orderProducts(String orderBy) {
        if(orderBy.equals("NAME Z TO A")) {
            productPage.sortProductsByNameZToA();
        }
    }

    @When("eu adiciono o produto no carrinho")
    public void addProductToCart() {
        productPage.addProductToCart();
    }
}
