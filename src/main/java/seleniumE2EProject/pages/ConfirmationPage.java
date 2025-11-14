package seleniumE2EProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage {

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".complete-header")
    private WebElement confirmationMessage;

    public String getConfirmationText() {
        return getText(confirmationMessage);
    }
}

