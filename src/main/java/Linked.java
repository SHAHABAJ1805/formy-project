import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.System.*;

public class Linked {
    public static void main (String args[])
    {
     System.setProperty("webdriver.chrome.driver","D:\\Driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name= driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("shahabaj pathan");
        WebElement button= driver.findElement(By.id("button"));
        button.click();
        driver.quit();


    }


}
