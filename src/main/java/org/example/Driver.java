package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    //public static WebDriver driver;
    public void OpenBrowser()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
    }
}
