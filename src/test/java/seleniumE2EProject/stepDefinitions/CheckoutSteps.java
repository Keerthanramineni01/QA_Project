package seleniumE2EProject.stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import seleniumE2EProject.pages.*;
import seleniumE2EProject.tests.BaseTest;

public class CheckoutSteps extends BaseTest {

    LoginPage login;
    ProductsPage products;
    CartPage cart;
    CheckoutPage checkout;
    ConfirmationPage confirmation;

    @Given("the user launches the SauceDemo application")
    public void launchApp() {
        setUp(); // opens browser and navigates
        login = new LoginPage(driver);
        products = new ProductsPage(driver);
        cart = new CartPage(driver);
        checkout = new CheckoutPage(driver);
        confirmation = new ConfirmationPage(driver);
    }

    @When("the user logs in with valid credentials")
    public void loginWithValidCredentials() {
        login.login("standard_user", "secret_sauce");
    }

    @And("the user adds two products to the cart")
    public void addProductsToCart() {
        products.addFirstTwoProductsToCart();
        products.goToCart();
    }

    @And("the user proceeds to checkout")
    public void proceedToCheckout() {
        cart.proceedToCheckout();
    }

    @And("the user enters checkout details")
    public void enterCheckoutDetails() {
        checkout.fillCheckoutDetails("Keerthan", "R", "75001");
        checkout.completeOrder();
    }

    @Then("the user should see the order confirmation message")
    public void verifyOrderConfirmation() {
        Assert.assertTrue(
            confirmation.getConfirmationText().contains("Thank you for your order!"),
            "Order confirmation not displayed!"
        );
        tearDown();
    }
}
