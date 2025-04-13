package Tests;

import org.testng.annotations.Test;

public class ProductTest extends BaseTest {
    @Test(dependsOnMethods = "testUserLogin")
    public void testAddProductToCart() throws InterruptedException {
        myAccountPage.clickOnHome();
        homePage.selectTheProduct();
        productPage.AddProductToCart();
        productPage.clickOnContainer();
        productPage.openCartPage();
        Thread.sleep(1000);

//       Assert.assertTrue(cartPage.isProductAdded(), "Product not added to cart");
    }
}