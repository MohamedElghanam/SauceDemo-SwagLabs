import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllItemsPage extends PageBase{
    public AllItemsPage(WebDriver driver) {
        super(driver);
    }
    WebElement clickOnBurgerIcon;
    WebElement clickOnAllitemsIcon;
    WebElement clickOnAddCartBackpack;
    WebElement clickOnAddCartLight;
    WebElement clickOnAddCartTshirt;

    public void ClickOnBurgerIcon()
    {
        clickOnBurgerIcon = driver.findElement(By.className("bm-burger-button"));
        Clicking(clickOnBurgerIcon);
    }

    public void clickOnAllitemsIcon()
    {
        clickOnAllitemsIcon = driver.findElement(By.id("inventory_sidebar_link"));
        Clicking(clickOnAllitemsIcon);
    }
    public void ClickOnAddCartBackpack()
    {
        clickOnAddCartBackpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        Clicking(clickOnAddCartBackpack);
    }
    public void ClickOnAddCartLight()
    {
        clickOnAddCartLight = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        Clicking(clickOnAddCartLight);
    }
    public void ClickOnAddCartTshirt()
    {
        clickOnAddCartTshirt = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        Clicking(clickOnAddCartTshirt);
    }
}
