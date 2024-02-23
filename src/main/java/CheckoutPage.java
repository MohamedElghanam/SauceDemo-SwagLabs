import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends PageBase{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    WebElement clickOnShoppingCartIcon;
    WebElement clickOnCheckoutIcon;
    WebElement sendFirstName;
    WebElement sendLastName;
    WebElement sendPostalCode;
    WebElement clickOnContinueButton;
    WebElement clickOnFinishButton;

    public void ClickOnShoppingCart()
    {
        clickOnShoppingCartIcon = driver.findElement(By.className("shopping_cart_link"));
        Clicking(clickOnShoppingCartIcon);
    }

    public void ClickOnCheckoutIcon()
    {
        clickOnCheckoutIcon = driver.findElement(By.id("checkout"));
        Clicking(clickOnCheckoutIcon);
    }

    public void SendFirstName(String firstname)
    {
        sendFirstName = driver.findElement(By.id("first-name"));
        SendText(sendFirstName, firstname);
    }
    public void SendLastName(String lastname)
    {
        sendLastName = driver.findElement(By.id("last-name"));
        SendText(sendLastName, lastname);
    }

    public void SendPostalCode(String postalcode)
    {
        sendPostalCode = driver.findElement(By.id("postal-code"));
        SendText(sendPostalCode, postalcode);
    }
    public void ClickOnContinueButton()
    {
        clickOnContinueButton = driver.findElement(By.id("continue"));
        Clicking(clickOnContinueButton);
    }
    public void ClickOnFinishButton()
    {
        clickOnFinishButton = driver.findElement(By.id("finish"));
        Clicking(clickOnFinishButton);
    }

}
