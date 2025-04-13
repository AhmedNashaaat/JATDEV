package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingAddressPage extends BasePage{

    public BillingAddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "street")
    WebElement streetTxt;
    @FindBy(id = "city")
    WebElement cityTxt;
    @FindBy(id = "state")
    WebElement stateTxt;
    @FindBy(id="country")
    WebElement  countryTxt;
    @FindBy(id = "postal_code")
    WebElement postalTxt;
    @FindBy(css = "div[class='col-md-6 offset-md-3 login-form-1'] div[class='float-end']")
    WebElement proceedBtn;


    public void setBillingData(String Street,String City,String State,String Country,String postalCode){
        enterTxt(streetTxt,Street);
        enterTxt(cityTxt,City);
        enterTxt(stateTxt,State);
        enterTxt(countryTxt,Country);
        enterTxt(postalTxt,postalCode);
    }
    public void clickProceedBtn(){
        WaitTheElementAndClick(proceedBtn);
    }
}
