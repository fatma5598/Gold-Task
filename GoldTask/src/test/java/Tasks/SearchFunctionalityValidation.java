package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFunctionalityValidation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\PC\\Downloads\\chromedriver_win32");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/ncr");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
        Thread.sleep(10000);
        driver.close();

    }
}
