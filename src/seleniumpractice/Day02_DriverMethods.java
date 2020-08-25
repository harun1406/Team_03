package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\harun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.get("http://google.com");

        String sayfaUrl = driver.getCurrentUrl();
        System.out.println(sayfaUrl);

        String sayfaTitle = driver.getTitle();
        System.out.println(sayfaTitle);

        driver.quit();


    }
}
