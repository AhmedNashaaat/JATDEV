package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    @Test
    public void testUserRegistration() throws InterruptedException {
        homePage.clickOnSignInBtn();
        loginPage.clickOnRegisterLink();

        registrationPage.enterRegisterDetails(
                testData.firstName,
                testData.lastName,
                testData.birthDate,
                testData.street,
                testData.postalCode,
                testData.city,
                testData.state,
                testData.country,
                testData.phone,
                testData.email,
                testData.password
        );

        registrationPage.clickOnRegisterBtn();
        Thread.sleep(2000); // Consider using explicit waits instead

        Assert.assertTrue(loginPage.isRegistrationSuccessful(), "Registration failed");
    }
}