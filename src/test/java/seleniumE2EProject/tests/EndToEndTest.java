package seleniumE2EProject.tests;



import seleniumE2EProject.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {

    @Test
    public void verifyCheckoutFlow() {
        LoginPage login = new LoginPage(driver);
        ProductsPage products = new ProductsPage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);
        ConfirmationPage confirmation = new ConfirmationPage(driver);

        // Step 1: Login
        login.login("standard_user", "secret_sauce");

        // Step 2: Add Products to Cart
        products.addFirstTwoProductsToCart();
        products.goToCart();

        // Step 3: Checkout
        cart.proceedToCheckout();
        checkout.fillCheckoutDetails("Keerthan", "R", "75001");
        checkout.completeOrder();

        // Step 4: Validate Order Confirmation
        String confirmationText = confirmation.getConfirmationText();
        Assert.assertTrue(confirmationText.contains("Thank you for your order!"),
                "Order confirmation message not displayed!");
    }
}

