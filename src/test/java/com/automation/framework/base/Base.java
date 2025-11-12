package com.automation.framework.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Base {
protected WebDriver webDriver;

@BeforeMethod
    public void setup(){
    WebDriverManager.chromedriver().setup();
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--start-maximized");
    webDriver = new ChromeDriver(chromeOptions);
   // webDriver.manage().window().maximize();
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
}

@AfterMethod
    public void tearDown(){
    if(webDriver!=null){
        webDriver.quit();

    }
}
}
