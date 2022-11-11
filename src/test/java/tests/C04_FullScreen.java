package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_FullScreen {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://finspiretech.com");

        driver.manage().window().maximize();

        System.out.println("Title = " + driver.getTitle());

        Thread.sleep(3000);

        driver.close();
    }
}
