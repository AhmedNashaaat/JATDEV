package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[normalize-space()='My account']")
    WebElement myAccountTitle;
    @FindBy(xpath = "(//*[name()='path'][@fill='currentColor'])[1]")
    WebElement cartIcon;
    @FindBy(linkText = "Home")
    WebElement homeBtn;


    public void clickOnCartIcon(){
        WaitTheElementAndClick(cartIcon);
    }
    public void clickOnHome()
    {
        WaitTheElementAndClick(homeBtn);
    }
    public boolean isLoggedInUserCorrect(String expectedName) {
        return myAccountTitle.getText().contains("My account");
    }
}
