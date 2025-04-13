package Tests;

import org.testng.annotations.Test;

public class BillingAddressTest extends BaseTest {
    @Test(dependsOnMethods = "testCheckoutProcess")
    public void testBillingAddressSubmission() throws InterruptedException {
        loginPage.setProceedToCheckOutBtn();
        Thread.sleep(2000);

        billingAddressPage.clickProceedBtn();
        Thread.sleep(2000);

//        Assert.assertTrue(paymentPage.isPaymentPageDisplayed(),
//                "Payment page not displayed after billing address");
    }
}