package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://finspiretech.com/");

        String title = driver.getTitle();
        System.out.println("title = " + title);

        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        Thread.sleep(3000);

        String url2 = "http://amazon.com";
        driver.navigate().to(url2);

        Thread.sleep(3000);

//        navigate back to finspire again
        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();
    }
}
