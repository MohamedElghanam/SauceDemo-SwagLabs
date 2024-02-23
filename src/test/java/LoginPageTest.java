import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class LoginPageTest extends TestBase{
    private LoginPage loginPage;

    @Test (priority = 1)
    public void ValidLoginTC()
    {
        loginPage = new LoginPage(driver);
        loginPage.SendUserText("standard_user");
        loginPage.SendPassText("secret_sauce");
        loginPage.ClickOnLoginButton();
    }
    @Test (priority = 2)
    public void MissingPassLoginTC() {
        loginPage = new LoginPage(driver);
        driver.findElement(By.className("bm-burger-button")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
        driver.findElement(By.id("user-name")).clear();
        loginPage.SendUserText("standard_user");
        loginPage.ClickOnLoginButton();
        String MissingPass = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        assertEquals(MissingPass, "Epic sadface: Password is required");
    }

}
