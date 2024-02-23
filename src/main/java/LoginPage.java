import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    WebElement usernameTextElement;
    WebElement passTextElement;
    WebElement clickLoginButton;

    public void SendUserText(String username)
    {
        usernameTextElement = driver.findElement(By.id("user-name"));
        SendText(usernameTextElement, username);
    }
    public void SendPassText(String pass)
    {
        passTextElement = driver.findElement(By.id("password"));
        SendText(passTextElement, pass);
    }
    public void ClickOnLoginButton() {
        clickLoginButton = driver.findElement(By.id("login-button"));
        Clicking(clickLoginButton);
        new LoginPage(driver);
    }
}
