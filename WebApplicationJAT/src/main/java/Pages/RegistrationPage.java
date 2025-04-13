package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "first_name")
    WebElement firstNameField;
    @FindBy(id="last_name")
    WebElement lastNameField;
    @FindBy(id="dob")
    WebElement  dateOfBirth;
    @FindBy(id="street")
    WebElement streetField;
    @FindBy(id = "postal_code")
    WebElement  postalCodeField;
    @FindBy(id = "city")
    WebElement  cityField;
    @FindBy(id= "state")
    WebElement stateField;
    @FindBy(id ="country" )
    WebElement  countryField;
    @FindBy(id = "phone")
    WebElement  phoneField;
    @FindBy(id = "email")
    WebElement  emailField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(css = "button[type='submit']")
    WebElement registerBtn;

    public void enterRegisterDetails(String fName,String lName,String dFB,String  street
    ,String postalCode,String city,String state,String country,String phone,String email,String password){
        enterTxt(firstNameField,fName);
        enterTxt(lastNameField,lName);
        enterTxt(dateOfBirth,dFB);
        enterTxt(streetField,street);
        enterTxt(postalCodeField,postalCode);
        enterTxt(cityField,city);
        enterTxt(stateField,state);
        selectElementFromDDL(countryField,country);
        enterTxt(phoneField,phone);
        enterTxt(emailField,email);
        enterTxt(passwordField,password);
    }


    public void clickOnRegisterBtn(){
        registerBtn.click();
    }


}
