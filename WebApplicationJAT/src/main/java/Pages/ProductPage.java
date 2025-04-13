package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[normalize-space()='Combination Pliers']")
    WebElement selectedProductTitle;

    @FindBy(id ="btn-add-to-cart")
    WebElement AddToCartBtn;

    @FindBy(id="toast-container")
    WebElement messageOfContainer;

    @FindBy(xpath = "//a[@aria-label='cart']")
    WebElement CartIcon;


    public void AddProductToCart()
    {
        WaitTheElementAndClick(AddToCartBtn);
    }
    public void clickOnContainer()
    {
        WaitTheElementAndClick(messageOfContainer);
    }
    public void openCartPage()
    {
        WaitTheElementAndClick(CartIcon);
    }
}
