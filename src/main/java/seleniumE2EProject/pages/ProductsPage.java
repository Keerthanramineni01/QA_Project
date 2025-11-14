package seleniumE2EProject.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
    	 super(driver);
    }

    @FindBy(className = "btn_inventory")
    private List<WebElement> addToCartButtons;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartIcon;

    public void addFirstTwoProductsToCart() {
        addToCartButtons.get(0).click();
        addToCartButtons.get(1).click();
    }

    public void goToCart() {
    	   click(cartIcon);
    }
}

