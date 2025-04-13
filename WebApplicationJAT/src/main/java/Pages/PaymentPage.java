package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{
    public PaymentPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="payment-method")
    WebElement setThePayment;
    @FindBy(css = "div[class='col-md-6 offset-md-3 login-form-1 ng-star-inserted'] div[class='float-end']")
    WebElement confirmBtn;
    @FindBy(css = ".help-block")
    public  WebElement paymentSuccessMessage;

    public void selectThePaymentMethod(){
        selectElementFromDDL(setThePayment,"cash-on-delivery");
    }
    public void clickOnConfirm(){
        WaitTheElementAndClick(confirmBtn);
    }


}
