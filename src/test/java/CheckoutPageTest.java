import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CheckoutPageTest extends TestBase{

    private CheckoutPage checkoutPage;
    private LoginPage loginPage;
    private AllItemsPage allItemsPage;

    @Test
    public void CheckoutList()
    {
        loginPage = new LoginPage(driver);
        checkoutPage = new CheckoutPage(driver);
        allItemsPage = new AllItemsPage(driver);
        loginPage.SendUserText("standard_user");
        loginPage.SendPassText("secret_sauce");
        loginPage.ClickOnLoginButton();
        allItemsPage.ClickOnAddCartBackpack();
        allItemsPage.ClickOnAddCartLight();
        allItemsPage.ClickOnAddCartTshirt();
        checkoutPage.ClickOnShoppingCart();
        checkoutPage.ClickOnCheckoutIcon();
        checkoutPage.SendFirstName("Mohamed");
        checkoutPage.SendLastName("Ahmed");
        checkoutPage.SendPostalCode("33511");
        checkoutPage.ClickOnContinueButton();
        String total = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")).getText();
        assertEquals(total, "Total: $60.45");
        checkoutPage.ClickOnFinishButton();
    }
}
