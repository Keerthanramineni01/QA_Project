package seleniumE2EProject.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement firstNameField;

    @FindBy(id = "last-name")
    private WebElement lastNameField;

    @FindBy(id = "postal-code")
    private WebElement postalCodeField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "finish")
    private WebElement finishButton;

    public void fillCheckoutDetails(String fName, String lName, String zip) {
        type(firstNameField, fName);
        type(lastNameField, lName);
        type(postalCodeField, zip);
        click(continueButton);
    }

    public void completeOrder() {
        click(finishButton);
    }
}
