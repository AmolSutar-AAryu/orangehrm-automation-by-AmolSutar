package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver webDriver;
    private WebDriverWait wait;


    private By userNameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginBtn = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }
    public void open(String url) {
        webDriver.get(url);
    }
    public void userName(String username){
       // webDriver.findElement(userNameField).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField)).clear();
        webDriver.findElement(userNameField).sendKeys(username);
    }

    public void enterpassword(String password){
        //webDriver.findElement(passwordField).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).clear();
        webDriver.findElement(passwordField).sendKeys(password);

    }

    public void clickbutton(){
        //webDriver.findElement(loginBtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn)).click();

    }
}
