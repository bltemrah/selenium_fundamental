package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_CloseQuite {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/open_new_tab");

        driver.manage().window().maximize();

        System.out.println("Title = " + driver.getTitle());

        Thread.sleep(3000);

        driver.close();

        Thread.sleep(3000);

        driver.quit();
    }
}
