import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AllItemsPageTest extends TestBase {

    private AllItemsPage allItemsPage;
    private LoginPage loginPage;

    @Test
    public void ChooseItems() {
        allItemsPage = new AllItemsPage(driver);
        loginPage = new LoginPage(driver);
        loginPage.SendUserText("standard_user");
        loginPage.SendPassText("secret_sauce");
        loginPage.ClickOnLoginButton();
        allItemsPage.ClickOnBurgerIcon();
        allItemsPage.clickOnAllitemsIcon();
        allItemsPage.ClickOnAddCartBackpack();
        allItemsPage.ClickOnAddCartLight();
        allItemsPage.ClickOnAddCartTshirt();
        String cart = driver.findElement(By.className("shopping_cart_badge")).getText();
        assertEquals(cart, "3");
    }
}
