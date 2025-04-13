package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(dependsOnMethods = "testUserRegistration")
    public void testUserLogin() throws InterruptedException {
        homePage.clickOnSignInBtn();
        Thread.sleep(1000);
        loginPage.enterTheEmail(testData.email);
        loginPage.enterThePassword(testData.password);
        loginPage.clickOnLoginBtn();
        Thread.sleep(1000);
        Assert.assertTrue(myAccountPage.isLoggedInUserCorrect("My account"), "Login failed");
    }
}