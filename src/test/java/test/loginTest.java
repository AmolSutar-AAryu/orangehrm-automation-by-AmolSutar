package test;

import com.automation.framework.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class loginTest extends Base {

    private static final Logger log = LoggerFactory.getLogger(loginTest.class);

    @Test
    public void verifyValidLogin(){
    LoginPage loginPage = new LoginPage(webDriver);
    loginPage.userName("Admin");
    loginPage.enterpassword("admin123");
    loginPage.clickbutton();


        WebDriverWait  webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement dashBoardHeader = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//h6[text()='Dashboard']")));

        Assert.assertTrue(dashBoardHeader.isDisplayed(), "Dashboard header not displayed, login might have failed");}

}
