package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_Homework {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\harun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");

        String faceTitle = driver.getTitle();
        System.out.println("Sayfanin Title'i " + faceTitle);

        if (faceTitle.contains("facebook")){
            System.out.println("Title'da facebook var");
        }else{
            System.out.println("Dogru Title " + faceTitle);
        }

        String faceUrl = driver.getCurrentUrl();
        System.out.println("Sayfanin Url'i " + faceUrl);

        if (faceUrl.contains("facebook")){
            System.out.println("Url'de facebook var");
        }else{
            System.out.println("Dogru Url " + faceUrl);
        }

        driver.navigate().to("http://walmart.com");

        String walmartTitle = driver.getTitle();







    }
}
