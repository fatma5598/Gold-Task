package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicPageValidation {
    public static void main(String[] args)
    {
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\PC\\Downloads\\chromedriver_win32");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/ncr");
        driver.manage().window().maximize();
        String ActualResult = driver.getTitle();
        String ExpectedResult = "Google";
        if (ActualResult.equals(ExpectedResult)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.close();

    }
}
