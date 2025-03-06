package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    public LoginSteps() {
        this.driver = Hooks.driver;
        loginPage = new LoginPage(driver);
    }

    @Given("eu acessei o site e estou na página de login")
    public void loginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("eu faço login com usuário {string} e senha {string}")
    public void login(String username, String password) {
        loginPage.login(username, password);
    }
}
