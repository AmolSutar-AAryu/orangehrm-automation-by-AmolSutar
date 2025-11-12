package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage {

    WebDriver webDriver;
    WebDriverWait webDriverWait;

    private By userMenu = By.xpath("//p[@class='oxd-userdropdown-name']");
    private By logoutLink = By.xpath("//a[text()='Logout']");

    public LogoutPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5));


    }

    public void logOut(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(userMenu)).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();

    }
}
