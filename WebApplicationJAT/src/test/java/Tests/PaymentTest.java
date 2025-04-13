package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {
    @Test(dependsOnMethods = "testBillingAddressSubmission")
    public void testPaymentProcess() throws InterruptedException {
        paymentPage.selectThePaymentMethod();
        paymentPage.clickOnConfirm();
        Thread.sleep(2000);

        Assert.assertTrue(paymentPage.paymentSuccessMessage.isDisplayed());
    }
}