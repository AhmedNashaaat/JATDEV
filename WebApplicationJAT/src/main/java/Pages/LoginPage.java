package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Register your account")
    WebElement registerYourAccountLink;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id ="password")
    WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginBtn;

    @FindBy(css = "div[class='col-md-6 offset-md-3 login-form-1'] div[class='float-end ng-star-inserted'] button[type='button']")
    WebElement proceedToCheckOutBtn;
    @FindBy(css = "div[class='col-lg-6 auth-form'] h3")
    WebElement userRegisteredSuccessfully;

    public void enterTheEmail(String email)
    {
        enterTxt(emailField,email);
    }
    public void enterThePassword(String password){
        enterTxt(passwordField,password);
    }
    public void clickOnLoginBtn(){
        WaitTheElementAndClick(loginBtn);
    }
    public void clickOnRegisterLink(){
        WaitTheElementAndClick(registerYourAccountLink);
    }
    public void setProceedToCheckOutBtn()
    {
        WaitTheElementAndClick(proceedToCheckOutBtn);
    }
    public boolean isRegistrationSuccessful() {
        try {
            return userRegisteredSuccessfully.isDisplayed() &&
                    userRegisteredSuccessfully.getText().contains("Login");
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
