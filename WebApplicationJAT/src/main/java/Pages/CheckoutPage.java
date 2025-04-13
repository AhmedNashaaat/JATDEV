package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

   @FindBy(xpath = "//strong[normalize-space()='Total']")
   WebElement   totalText;

   @FindBy(css = "div[class='float-end ng-star-inserted'] button[type='button']")
   WebElement   proceedToCheckoutBtn;

   @FindBy(xpath ="//a[normalize-space()='Register your account']")
   WebElement   registerLink;

   @FindBy(xpath = "//p[@class='ng-star-inserted']")
   public WebElement   helloMessage;


    public void completeOrder() {
        WaitTheElementAndClick(proceedToCheckoutBtn);
    }

    public void clickOnRegisterLink(){
        WaitTheElementAndClick(registerLink);
    }
    public boolean isCheckoutPageDisplayed() {
        try {
            return totalText.isDisplayed() &&
                    totalText.getText().contains("Total");
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}