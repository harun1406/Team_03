package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day02_IfElse {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\harun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.get("http://amazon.com");

        String amazonTitle = driver.getTitle();
        System.out.println(amazonTitle);

        String amazonBaslik = driver.getTitle();

        if (amazonTitle.contains("Computers")){
            System.out.println("Computers kelimesi var!");

        }else{
            System.out.println("Computers kelimesi yok!");


        }
        driver.quit();
    }
}
