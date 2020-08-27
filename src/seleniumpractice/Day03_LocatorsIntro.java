package seleniumpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_LocatorsIntro {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\harun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");

        WebElement signIn = driver.findElement(By.name("commit"));
        signIn.click();

        String girisTitle = driver.getTitle();
        System.out.println(girisTitle);

        if (girisTitle.contains("Address Book")){
            System.out.println("Kullanici ismi dogru");
        }else{
            System.out.println("Kullanici ismi yanlis");

        }







    }


}
