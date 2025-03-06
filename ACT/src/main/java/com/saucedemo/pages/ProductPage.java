package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    private By sortByDropdown = By.className("product_sort_container");
    private By addToCartButton = By.xpath("//button[text()='ADD TO CART']");
    private By cartIcon = By.className("shopping_cart_link");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sortProductsByNameZToA() {
        driver.findElement(sortByDropdown).sendKeys("Name (Z to A)");
    }

    public void addProductToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}
