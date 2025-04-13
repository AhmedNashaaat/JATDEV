package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {
    @Test(dependsOnMethods = "testAddProductToCart")
    public void testCheckoutProcess() throws InterruptedException {
        homePage.selectTheProduct();
        productPage.AddProductToCart();
        productPage.clickOnContainer();
        productPage.openCartPage();
        checkoutPage.completeOrder();
        loginPage.enterTheEmail(testData.email);
        loginPage.enterThePassword(testData.password);
        loginPage.clickOnLoginBtn();
        loginPage.setProceedToCheckOutBtn();
        Thread.sleep(3000);
        billingAddressPage.clickProceedBtn();
        paymentPage.selectThePaymentMethod();
        paymentPage.clickOnConfirm();
        Thread.sleep(1000);

        Assert.assertTrue(paymentPage.paymentSuccessMessage.isDisplayed(),
                "Payment Is Not Completed");
    }
}