package org.example;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Goo {
    public static WebDriver driver;
    public static void main (String[] args) throws InterruptedException
    {
        Goo goo=new Goo();
        goo.datafetch();

    }


    public void datafetch() throws InterruptedException
    {

        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
       System.setProperty("webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/finance/markets/gainers?hl=en");
        //driver.findElement(By.xpath("(//a[@class='GqNdIe GqNdIe-YySNWc'][normalize-space()='Gainers'])[3]")).click();
        Thread.sleep(1000);
        List<WebElement> listi = driver.findElements(By.className("SxcTic"));

        for (int i=0;i<listi.size();i++)
        {
            String rate=listi.get(i).getText();
            String[] arr = rate.trim().split("[ ? +]+");

            for (int j = 0; j < arr.length; j++)
            {

                System.out.print("array indexxx " + j + "   " + arr[j]);
                System.out.println("\n");
            }
        }
        driver.close();

    }

}