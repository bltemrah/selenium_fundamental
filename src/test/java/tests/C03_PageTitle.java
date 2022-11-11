package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_PageTitle {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://finspiretech.com/");

        String title = driver.getTitle();
        System.out.println("title = " + title);

        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        Thread.sleep(3000);

        driver.close();
    }
}
