package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashBoardPage {

    private  WebDriver webDriver;
    private  WebDriverWait webDriverWait;

    private By DashBoardHeader = By.xpath("//h6[text()='Dashboard']");

    public DashBoardPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public boolean isDashBoardIsVisible (){
        try {
            return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(DashBoardHeader)).isDisplayed();
        }
        catch (Exception e){
            return  false;
        }
    }
}
