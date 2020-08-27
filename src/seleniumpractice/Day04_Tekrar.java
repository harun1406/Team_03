package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_Tekrar {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\harun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.get("http://facebook.com");

        String faceTitle = driver.getTitle();
        System.out.println(faceTitle);

        if (faceTitle.contains("facebook")){
            System.out.println("Title dogru" );
        }else{
            System.out.println("Title yanlis " + faceTitle);
        }

        String faceUrl = driver.getCurrentUrl();
        System.out.println(faceUrl);

        if (faceUrl.contains("Facebook")){
            System.out.println("Url'de facebook kelimesi var");
        }else{
            System.out.println("Url'de facebook kelimesi yok " + faceUrl);
        }

        driver.navigate().to("http://www.walmart.com/");

        String walmartTitle = driver.getTitle();
        System.out.println(walmartTitle);

        if (walmartTitle.contains("Walmart.com")){
            System.out.println("Title 'Walmart.com' iceriyor");

        }else{
            System.out.println("Title 'Walmart.com' icermiyor " + walmartTitle);
        }

        driver.navigate().back();
        driver.navigate().refresh();

        driver.close();


    }
}
