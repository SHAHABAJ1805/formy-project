import net.bytebuddy.build.Plugin;
import org.apache.hc.core5.reactor.Command;
import org.example.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class Scroll  {
//    public static WebDriver driver;
    WebDriver driver=new FirefoxDriver();
    @Test(priority = 3)
    public void scroll()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement name=driver.findElement(By.id("name"));
        Actions actons=new Actions(driver);
        actons.moveToElement(name);
        name.sendKeys("shahabaj khan pathan");
        WebElement date= driver.findElement(By.id("date"));
        date.sendKeys("01/01/1990");
    }
    @Test(priority = 2)
    public void handle()
    {
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newtabButton= driver.findElement(By.id("new-tab-button"));
        newtabButton.click();
        String OrignalHandle= driver.getWindowHandle();
        for(String handle1:driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(OrignalHandle);
        }
    @Test(priority = 1)
    public void alert()
    {
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alertButton= driver.findElement(By.id("alert-button"));
        alertButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    @Test(priority = 4)
    public void drag()
    {
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement image= driver.findElement(By.id("image"));
        WebElement box =driver.findElement(By.id("box"));
        Actions action=new Actions(driver);
        action.dragAndDrop(image,box).build().perform();


    }
}
