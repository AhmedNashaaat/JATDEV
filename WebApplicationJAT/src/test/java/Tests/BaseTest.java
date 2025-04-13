package Tests;

import Data.jsonDataReader;
import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected CartPage cartPage;
    protected ProductPage productPage;
    protected CheckoutPage checkoutPage;
    protected RegistrationPage registrationPage;
    protected LoginPage loginPage;
    protected MyAccountPage myAccountPage;
    protected BillingAddressPage billingAddressPage;
    protected PaymentPage paymentPage;
    protected jsonDataReader testData;

    @BeforeMethod
    public void setUp() throws IOException, ParseException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/");

        // Initialize pages
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        productPage = new ProductPage(driver);
        checkoutPage = new CheckoutPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
        myAccountPage = new MyAccountPage(driver);
        billingAddressPage = new BillingAddressPage(driver);
        paymentPage = new PaymentPage(driver);

        // Load test data
        testData = new jsonDataReader();
        testData.jsonReader();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}