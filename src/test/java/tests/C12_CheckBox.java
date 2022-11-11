package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class C12_CheckBox {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/");

        driver.findElement(By.xpath("//*[@href = \"/checkboxes\"]")).click();
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[text() = \"Checkbox 1\"]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[text() = \"Checkbox 2\"]")).click();

        Thread.sleep(3000);

        List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
//        look through this list of elements
        for (WebElement checkbox:checkboxes) {
            Thread.sleep(3000);
            if (!checkbox.isSelected()) {
//                select it
                checkbox.click();
            }
        }

        Thread.sleep(3000);
        driver.close();
    }
}
