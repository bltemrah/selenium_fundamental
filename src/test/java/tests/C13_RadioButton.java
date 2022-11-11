package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class C13_RadioButton {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/");

        driver.findElement(By.xpath("//*[text() = \"Dropdown\"]")).click();
        Thread.sleep(3000);

//        select by text
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");

        Thread.sleep(3000);

//       select by Value
        Select value = new Select(driver.findElement(By.id("state")));
        value.selectByValue("DC");

        Thread.sleep(3000);

//        select by index
        Select index = new Select(driver.findElement(By.id("state")));
        index.selectByIndex(5);

//        select multi dropdown
        Select multiDropdown = new Select(driver.findElement(By.name("Languages")));
        multiDropdown.selectByIndex(5);

        List<WebElement> options = select.getOptions();

        for (WebElement option: options) {
            Thread.sleep(3000);
            select.selectByVisibleText(option.getText());
        }

        Thread.sleep(3000);

        select.deselectAll();

        Thread.sleep(3000);
        driver.close();
    }
}
