package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(css = ".product-box-add-to-cart-button")
    WebElement firstAddToCartButton;

    @FindBy(css = "img[alt='Combination Pliers']")
    WebElement CombinationPliersImage;

    @FindBy(linkText = "Sign in")
    WebElement signInIcon;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void addFirstProductToCart() {
        firstAddToCartButton.click();
    }
    public void selectTheProduct()
    {
        WaitTheElementAndClick(CombinationPliersImage);
    }
    public void clickOnSignInBtn(){
        WaitTheElementAndClick(signInIcon);
    }

}